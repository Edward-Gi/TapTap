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
public class Price {

    private String google;
    private String apple;
    private String taptap_current;
    private String taptap_original;
    public void setGoogle(String google) {
         this.google = google;
     }
     public String getGoogle() {
         return google;
     }

    public void setApple(String apple) {
         this.apple = apple;
     }
     public String getApple() {
         return apple;
     }

    public void setTaptap_current(String taptap_current) {
         this.taptap_current = taptap_current;
     }
     public String getTaptap_current() {
         return taptap_current;
     }

    public void setTaptap_original(String taptap_original) {
         this.taptap_original = taptap_original;
     }
     public String getTaptap_original() {
         return taptap_original;
     }

    @Override
    public String toString() {
        return "Price{" +
                "google='" + google + '\'' +
                ", apple='" + apple + '\'' +
                ", taptap_current='" + taptap_current + '\'' +
                ", taptap_original='" + taptap_original + '\'' +
                '}';
    }
}