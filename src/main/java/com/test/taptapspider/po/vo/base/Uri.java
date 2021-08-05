/**
  * Copyright 2021 json.cn 
  */
package com.test.taptapspider.po.vo.base;

/**
 * Auto-generated: 2021-08-04 14:15:38
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Uri {

    private String google;
    private String google_play;
    private String apple;
    private String download_site;
    public void setGoogle(String google) {
         this.google = google;
     }
     public String getGoogle() {
         return google;
     }

    public void setGoogle_play(String google_play) {
         this.google_play = google_play;
     }
     public String getGoogle_play() {
         return google_play;
     }

    public void setApple(String apple) {
         this.apple = apple;
     }
     public String getApple() {
         return apple;
     }

    public void setDownload_site(String download_site) {
         this.download_site = download_site;
     }
     public String getDownload_site() {
         return download_site;
     }

    @Override
    public String toString() {
        return "Uri{" +
                "google='" + google + '\'' +
                ", google_play='" + google_play + '\'' +
                ", apple='" + apple + '\'' +
                ", download_site='" + download_site + '\'' +
                '}';
    }
}