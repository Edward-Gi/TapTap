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
public class Apk {

    private String name;
    private long size;
    private int version_code;
    private String version_name;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setSize(long size) {
         this.size = size;
     }
     public long getSize() {
         return size;
     }

    public void setVersion_code(int version_code) {
         this.version_code = version_code;
     }
     public int getVersion_code() {
         return version_code;
     }

    public void setVersion_name(String version_name) {
         this.version_name = version_name;
     }
     public String getVersion_name() {
         return version_name;
     }

    @Override
    public String toString() {
        return "Apk{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", version_code=" + version_code +
                ", version_name='" + version_name + '\'' +
                '}';
    }
}