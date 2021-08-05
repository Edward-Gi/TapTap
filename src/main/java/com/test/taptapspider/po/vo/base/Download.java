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
public class Download {

    private long apk_id;
    private Apk apk;
    private List<String> obbs;
    private List<Apk_permissions> apk_permissions;
    public void setApk_id(long apk_id) {
         this.apk_id = apk_id;
     }
     public long getApk_id() {
         return apk_id;
     }

    public void setApk(Apk apk) {
         this.apk = apk;
     }
     public Apk getApk() {
         return apk;
     }

    public void setObbs(List<String> obbs) {
         this.obbs = obbs;
     }
     public List<String> getObbs() {
         return obbs;
     }

    public void setApk_permissions(List<Apk_permissions> apk_permissions) {
         this.apk_permissions = apk_permissions;
     }
     public List<Apk_permissions> getApk_permissions() {
         return apk_permissions;
     }

    @Override
    public String toString() {
        return "Download{" +
                "apk_id=" + apk_id +
                ", apk=" + apk +
                ", obbs=" + obbs +
                ", apk_permissions=" + apk_permissions +
                '}';
    }
}