/**
  * Copyright 2021 json.cn 
  */
package com.test.taptapspider.po.vo.base;
import com.alibaba.fastjson.annotation.JSONField;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.List;

/**
 * Auto-generated: 2021-08-04 14:15:38
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Data {
    @JSONField(name = "list")
    private List<Game> game_list;
    private String prev_page;
    private String next_page;
    private int total;
    private Seo seo;

    public Data(){};

    public Data(List<Game> game_list, String prev_page, String next_page, int total, Seo seo) {
        this.game_list = game_list;
        this.prev_page = prev_page;
        this.next_page = next_page;
        this.total = total;
        this.seo = seo;
    }

    public List<Game> getGame_list() {
        return game_list;
    }

    public void setGame_list(List<Game> game_list) {
        this.game_list = game_list;
    }

    public String getPrev_page() {
        return prev_page;
    }

    public void setPrev_page(String prev_page) {
        this.prev_page = prev_page;
    }

    public String getNext_page() {
        return next_page;
    }

    public void setNext_page(String next_page) {
        this.next_page = next_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Seo getSeo() {
        return seo;
    }

    public void setSeo(Seo seo) {
        this.seo = seo;
    }

    @Override
    public String toString() {
        return "Data{" +
                "game_list=" + game_list +
                ", prev_page='" + prev_page + '\'' +
                ", next_page='" + next_page + '\'' +
                ", total=" + total +
                ", seo=" + seo +
                '}';
    }
}