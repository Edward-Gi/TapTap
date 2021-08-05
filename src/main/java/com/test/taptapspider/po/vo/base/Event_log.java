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
public class Event_log {

    private long paramId;
    private String paramType;
    private String via;
    public void setParamId(long paramId) {
         this.paramId = paramId;
     }
     public long getParamId() {
         return paramId;
     }

    public void setParamType(String paramType) {
         this.paramType = paramType;
     }
     public String getParamType() {
         return paramType;
     }

    public void setVia(String via) {
         this.via = via;
     }
     public String getVia() {
         return via;
     }

    @Override
    public String toString() {
        return "Event_log{" +
                "paramId=" + paramId +
                ", paramType='" + paramType + '\'' +
                ", via='" + via + '\'' +
                '}';
    }
}