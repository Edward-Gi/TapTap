package com.test.taptapspider;

import com.alibaba.fastjson.JSON;
import com.test.taptapspider.po.vo.base.Data;
import com.test.taptapspider.po.vo.base.Game;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TapTapSpider {
    private static final String URL_BASE="https://www.taptap.com/webapiv2/app-top/v1/hits?from=";
    private static final String URL_ITEM ="&limit=15&platform=android&type_name=hot&X-UA=V%3D1%26PN%3DWebApp%26LANG%3Dzh_CN%26VN_CODE%3D37%26VN%3D0.1.0%26LOC%3DCN%26PLT%3DPC%26DS%3DAndroid%26UID%3D88016dbe-b537-4738-9ad0-d15da56ff491%26DT%3DPC\n";
    private static final String USER_AGENT="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";
    private static final String URL_COMMENT_FRONT = "https://www.taptap.com/webapiv2/review/v2/by-app?app_id=";
    private static final String URL_COMMENT_MID = "&limit=10&from=";
    private static final String URL_COMMENT_BACK = "&X-UA=V%3D1%26PN%3DWebApp%26LANG%3Dzh_CN%26VN_CODE%3D37%26VN%3D0.1.0%26LOC%3DCN%26PLT%3DPC%26DS%3DAndroid%26UID%3D88016dbe-b537-4738-9ad0-d15da56ff491%26DT%3DPC";
    public static void getComment(String game_id,String game_info,String game_review_count) throws IOException {
        long mag_page = Long.valueOf(game_review_count)/10;
        for(int i=0;i<mag_page;i+=10)
        {
            String URL = URL_COMMENT_FRONT+game_id+URL_COMMENT_MID+i+URL_COMMENT_BACK;
            Connection connection = Jsoup.connect(URL);
            connection.timeout(400);
            Document document = Jsoup.connect(URL).userAgent(USER_AGENT).ignoreContentType(true).get();
            String jdJsonText = document.text();
            Map map = (Map) JSON.parse(jdJsonText);
            Map data_map = (Map) map.get("data");
            List<Map> review_list = (List<Map>) data_map.get("list");
            for(Map review_map:review_list)
            {
                Map review_moment = (Map) review_map.get("moment");

                Map review_author = (Map) review_moment.get("author");
                Map review_user = (Map) review_author.get("user");
                String user_id = Integer.toString((Integer)review_user.get("id"));  // ���id

                Map review_extended_entities = (Map) review_moment.get("extended_entities");
                List<Map> review_reviews = (List<Map>) review_extended_entities.get("reviews");
                String review_review_list = "";     // ����Ҷ������Ϸ�������б��á�|���ָ�

                for(int j=0;j<review_reviews.size();j++)
                {
                    Map review_content = (Map) review_reviews.get(j).get("contents");

                    review_review_list = review_review_list + (String) review_reviews.get(j).get("played_tips")+
                            review_content.get("text");
                }
            }
        }



    }

    public static void main(String[] args) throws IOException {
        for(int i=0;i<=45;i+=15)
        {
            String URL = URL_BASE+i+URL_ITEM;
            Connection connection =Jsoup.connect(URL);
            connection.timeout(400);
            Document document = Jsoup.connect(URL).userAgent(USER_AGENT).ignoreContentType(true).get();

            String jdJsonText = document.text();
            Map map = (Map) JSON.parse(jdJsonText);
            Map data_map = (Map) map.get("data");
            List<Map> game_list = (List<Map>) data_map.get("list");
            for(Map game_map:game_list)
            {
                String game_id = Integer.toString((Integer) game_map.get("id")) ; // ��ϷID
                String game_title = (String) game_map.get("title"); // ��Ϸ����
                String game_category = (String) game_map.get("category");  // ��Ϸ����
                String game_author = (String) game_map.get("author");  // ��Ϸ������

                Map price = (Map) game_map.get("price");
                // ��Ϸ���ۼ�  # ��������Ϸ��ֵ�������ϷΪ""
                String google = (String) price.get("google");
                String apple = (String) price.get("apple");
                String taptap_current = (String) price.get("taptap_current");
                String taptap_original = (String) price.get("taptap_original");
                String game_price_list=""; // ��Ϸ���м۸񣬲�ͬ�۸��ԡ�|���ָ� eg. 36|45|18|0
                if(google.equals(""))
                    game_price_list = game_price_list + "0"+"|";
                else
                    game_price_list = game_price_list + google+"|";
                if(apple.equals(""))
                    game_price_list = game_price_list + "0" + "|";
                else
                    game_price_list = game_price_list + apple + "|";
                if(taptap_current.equals(""))
                    game_price_list = game_price_list + "0" + "|";
                else
                    game_price_list = game_price_list + taptap_current + "|";
                if(taptap_original.equals(""))
                    game_price_list = game_price_list + "0";
                else
                    game_price_list = game_price_list + taptap_original;

                String hints = (String) price.get("hints"); // ��Ϸ����ʱ��

                List<Map> tags = (List<Map>) game_map.get("tags");
                String game_tags = ""; // ��Ϸ���б�ǩ����ͬ��ǩ�ԡ�|���ָ�
                int len = tags.size();
                if(len>0)
                {
                    for(int j=0;j<len-1;j++)
                {
                    game_tags = game_tags + (String) tags.get(j).get("value")+"|";
                }
                game_tags = game_tags+(String) tags.get(tags.size()-1).get("value");
                }
                else
                    game_tags="null";  // ��null��ʾ����Ϸ��ǩ

                Map game_stat = (Map) game_map.get("stat");
                Map game_rating = (Map) game_stat.get("rating");
                String game_score = (String) game_rating.get("score");  // ��Ϸ����
                String game_download_count = Integer.toString((Integer)game_stat.get("download_count"));  // ��������
                String game_fans_count = Integer.toString((Integer) game_stat.get("fans_count"));  // ��ע����
                String game_review_count = Integer.toString((Integer) game_stat.get("review_count"));  // ��������

                String game_info = game_id+"#"+game_title+"#"+game_category+"#"+game_author+"#"+game_score+
                        "#"+game_tags+"#"+game_price_list+"#"+game_download_count+"#"+game_fans_count+"#"+game_review_count;
                // ��Ϸ��Ϣ���� eg. 131584#EVE��սǰҹ���޽��Ǻӣ�Ԥ���أ�#����#������Ϸ#8.3#̫��|ɳ��|�ƻ�|�ɴ�#0|0|0|0#100712#765144

                getComment(game_id,game_info,game_review_count);    //  ��ȡ����
            }




        }

    }
}
