/**
  * Copyright 2021 json.cn 
  */
package com.test.taptapspider.po.vo.base;
import java.util.List;

/**
 * Auto-generated: 2021-08-04 14:15:38
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Apk_permissions {

    private String label;
    private List<PermissionData> data;
    public void setLabel(String label) {
         this.label = label;
     }
     public String getLabel() {
         return label;
     }

    public void setData(List<PermissionData> data) {
         this.data = data;
     }
     public List<PermissionData> getData() {
         return data;
     }

    @Override
    public String toString() {
        return "Apk_permissions{" +
                "label='" + label + '\'' +
                ", data=" + data +
                '}';
    }
}