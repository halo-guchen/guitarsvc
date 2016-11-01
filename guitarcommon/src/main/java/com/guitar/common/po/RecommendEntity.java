package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* recommend 表 Pojo
*/
@Table(name = "recommend")
public class RecommendEntity {
    /*  */
    private String id;
    /* 推荐的视频 */
    private String videoId;
    /* 主题 */
    private String title;
    /* 更新时间 */
    private Date updateTime;


    /* set  */
    public void setId(String id) {
        this.id = id;
    }

    /* get  */
    public String getId() {
        return id;
    }

    /* set 推荐的视频 */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /* get 推荐的视频 */
    public String getVideoId() {
        return videoId;
    }

    /* set 主题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /* get 主题 */
    public String getTitle() {
        return title;
    }

    /* set 更新时间 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /* get 更新时间 */
    public Date getUpdateTime() {
        return updateTime;
    }

}
