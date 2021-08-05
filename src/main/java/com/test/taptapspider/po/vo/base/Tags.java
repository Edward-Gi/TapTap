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
public class Tags {

    private long id;
    private String value;
    private String uri;
    private String web_url;
    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
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
        return "Tags{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", uri='" + uri + '\'' +
                ", web_url='" + web_url + '\'' +
                '}';
    }
}