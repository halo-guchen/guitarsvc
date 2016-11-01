package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* video 表 Pojo
*/
@Table(name = "video")
public class VideoEntity {
    /*  */
    private String id;
    /* 主讲人 */
    private String mainPerson;
    /* 发布时间 */
    private Date publishTime;
    /* 上传时间 */
    private Date uploadTime;
    /* 上传人的姓名 */
    private String uploadUserName;
    /* 课程标题 */
    private String title;
    /* 视频简介 */
    private String description;
    /* 视频地址 */
    private String videoSrc;
    /* 点击次数 */
    private Integer clickCount;
    /* 播放次数 */
    private Integer playCount;
    /* 收藏数量 */
    private Integer collectCount;
    /* 顶的次数 */
    private Integer pushCount;


    /* set  */
    public void setId(String id) {
        this.id = id;
    }

    /* get  */
    public String getId() {
        return id;
    }

    /* set 主讲人 */
    public void setMainPerson(String mainPerson) {
        this.mainPerson = mainPerson;
    }

    /* get 主讲人 */
    public String getMainPerson() {
        return mainPerson;
    }

    /* set 发布时间 */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /* get 发布时间 */
    public Date getPublishTime() {
        return publishTime;
    }

    /* set 上传时间 */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /* get 上传时间 */
    public Date getUploadTime() {
        return uploadTime;
    }

    /* set 上传人的姓名 */
    public void setUploadUserName(String uploadUserName) {
        this.uploadUserName = uploadUserName;
    }

    /* get 上传人的姓名 */
    public String getUploadUserName() {
        return uploadUserName;
    }

    /* set 课程标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /* get 课程标题 */
    public String getTitle() {
        return title;
    }

    /* set 视频简介 */
    public void setDescription(String description) {
        this.description = description;
    }

    /* get 视频简介 */
    public String getDescription() {
        return description;
    }

    /* set 视频地址 */
    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    /* get 视频地址 */
    public String getVideoSrc() {
        return videoSrc;
    }

    /* set 点击次数 */
    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    /* get 点击次数 */
    public Integer getClickCount() {
        return clickCount;
    }

    /* set 播放次数 */
    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    /* get 播放次数 */
    public Integer getPlayCount() {
        return playCount;
    }

    /* set 收藏数量 */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /* get 收藏数量 */
    public Integer getCollectCount() {
        return collectCount;
    }

    /* set 顶的次数 */
    public void setPushCount(Integer pushCount) {
        this.pushCount = pushCount;
    }

    /* get 顶的次数 */
    public Integer getPushCount() {
        return pushCount;
    }

}
