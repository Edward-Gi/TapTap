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
public class Banner {

    private String url;
    private String medium_url;
    private String original_url;
    private String original_format;
    private int width;
    private int height;
    private String color;
    private long original_size;
    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setMedium_url(String medium_url) {
         this.medium_url = medium_url;
     }
     public String getMedium_url() {
         return medium_url;
     }

    public void setOriginal_url(String original_url) {
         this.original_url = original_url;
     }
     public String getOriginal_url() {
         return original_url;
     }

    public void setOriginal_format(String original_format) {
         this.original_format = original_format;
     }
     public String getOriginal_format() {
         return original_format;
     }

    public void setWidth(int width) {
         this.width = width;
     }
     public int getWidth() {
         return width;
     }

    public void setHeight(int height) {
         this.height = height;
     }
     public int getHeight() {
         return height;
     }

    public void setColor(String color) {
         this.color = color;
     }
     public String getColor() {
         return color;
     }

    public void setOriginal_size(long original_size) {
         this.original_size = original_size;
     }
     public long getOriginal_size() {
         return original_size;
     }

    @Override
    public String toString() {
        return "Banner{" +
                "url='" + url + '\'' +
                ", medium_url='" + medium_url + '\'' +
                ", original_url='" + original_url + '\'' +
                ", original_format='" + original_format + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", original_size=" + original_size +
                '}';
    }
}