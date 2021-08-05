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
public class Unreserved {

    private String uri;
    private Params params;
    public void setUri(String uri) {
         this.uri = uri;
     }
     public String getUri() {
         return uri;
     }

    public void setParams(Params params) {
         this.params = params;
     }
     public Params getParams() {
         return params;
     }

    @Override
    public String toString() {
        return "Unreserved{" +
                "uri='" + uri + '\'' +
                ", params=" + params +
                '}';
    }
}