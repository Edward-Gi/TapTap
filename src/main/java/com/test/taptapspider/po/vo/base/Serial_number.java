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
public class Serial_number {

    private boolean number_exists;
    private int button_action;
    private boolean has_gift_code;
    private boolean has_activation_code;
    public void setNumber_exists(boolean number_exists) {
         this.number_exists = number_exists;
     }
     public boolean getNumber_exists() {
         return number_exists;
     }

    public void setButton_action(int button_action) {
         this.button_action = button_action;
     }
     public int getButton_action() {
         return button_action;
     }

    public void setHas_gift_code(boolean has_gift_code) {
         this.has_gift_code = has_gift_code;
     }
     public boolean getHas_gift_code() {
         return has_gift_code;
     }

    public void setHas_activation_code(boolean has_activation_code) {
         this.has_activation_code = has_activation_code;
     }
     public boolean getHas_activation_code() {
         return has_activation_code;
     }

    @Override
    public String toString() {
        return "Serial_number{" +
                "number_exists=" + number_exists +
                ", button_action=" + button_action +
                ", has_gift_code=" + has_gift_code +
                ", has_activation_code=" + has_activation_code +
                '}';
    }
}