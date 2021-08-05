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
public class Log {

    private Download_new download_new;
    private Download_new_complete download_new_complete;
    private Download_new_failed download_new_failed;
    private Download_update download_update;
    private Download_update_complete download_update_complete;
    private Download_update_failed download_update_failed;
    private Page_view page_view;
    private Play play;
    private Reserve reserve;
    private Unreserved unreserved;
    private Follow follow;
    private Unfollow unfollow;
    private Open open;
    public void setDownload_new(Download_new download_new) {
         this.download_new = download_new;
     }
     public Download_new getDownload_new() {
         return download_new;
     }

    public void setDownload_new_complete(Download_new_complete download_new_complete) {
         this.download_new_complete = download_new_complete;
     }
     public Download_new_complete getDownload_new_complete() {
         return download_new_complete;
     }

    public void setDownload_new_failed(Download_new_failed download_new_failed) {
         this.download_new_failed = download_new_failed;
     }
     public Download_new_failed getDownload_new_failed() {
         return download_new_failed;
     }

    public void setDownload_update(Download_update download_update) {
         this.download_update = download_update;
     }
     public Download_update getDownload_update() {
         return download_update;
     }

    public void setDownload_update_complete(Download_update_complete download_update_complete) {
         this.download_update_complete = download_update_complete;
     }
     public Download_update_complete getDownload_update_complete() {
         return download_update_complete;
     }

    public void setDownload_update_failed(Download_update_failed download_update_failed) {
         this.download_update_failed = download_update_failed;
     }
     public Download_update_failed getDownload_update_failed() {
         return download_update_failed;
     }

    public void setPage_view(Page_view page_view) {
         this.page_view = page_view;
     }
     public Page_view getPage_view() {
         return page_view;
     }

    public void setPlay(Play play) {
         this.play = play;
     }
     public Play getPlay() {
         return play;
     }

    public void setReserve(Reserve reserve) {
         this.reserve = reserve;
     }
     public Reserve getReserve() {
         return reserve;
     }

    public void setUnreserved(Unreserved unreserved) {
         this.unreserved = unreserved;
     }
     public Unreserved getUnreserved() {
         return unreserved;
     }

    public void setFollow(Follow follow) {
         this.follow = follow;
     }
     public Follow getFollow() {
         return follow;
     }

    public void setUnfollow(Unfollow unfollow) {
         this.unfollow = unfollow;
     }
     public Unfollow getUnfollow() {
         return unfollow;
     }

    public void setOpen(Open open) {
         this.open = open;
     }
     public Open getOpen() {
         return open;
     }

    @Override
    public String toString() {
        return "Log{" +
                "download_new=" + download_new +
                ", download_new_complete=" + download_new_complete +
                ", download_new_failed=" + download_new_failed +
                ", download_update=" + download_update +
                ", download_update_complete=" + download_update_complete +
                ", download_update_failed=" + download_update_failed +
                ", page_view=" + page_view +
                ", play=" + play +
                ", reserve=" + reserve +
                ", unreserved=" + unreserved +
                ", follow=" + follow +
                ", unfollow=" + unfollow +
                ", open=" + open +
                '}';
    }
}