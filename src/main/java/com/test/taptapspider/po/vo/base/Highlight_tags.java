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
public class Highlight_tags {

    private String type;
    private String uri;
    private String web_url;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setUri(String uri) {
         this.uri = uri;
     }
     public String getUri() {
         return uri;
     }

    public void setWeb_url(String web_url) {
         this.web_url = web_url;
     }
     public String getWeb_url() {
         return web_url;
     }

    @Override
    public String toString() {
        return "Highlight_tags{" +
                "type='" + type + '\'' +
                ", uri='" + uri + '\'' +
                ", web_url='" + web_url + '\'' +
                '}';
    }
}