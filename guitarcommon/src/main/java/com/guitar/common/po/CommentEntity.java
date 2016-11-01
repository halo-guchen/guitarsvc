package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* comment 表 Pojo
*/
@Table(name = "comment")
public class CommentEntity {
    /* 主键id */
    private String id;
    /* 视频的id */
    private String videoId;
    /* 评论内容 */
    private String content;
    /* 评论人的id */
    private String userId;
    /* 评论时间 */
    private Date submitTime;
    /* 点赞次数 */
    private Integer pushCount;
    /* 回复内容 */
    private String reply;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 视频的id */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /* get 视频的id */
    public String getVideoId() {
        return videoId;
    }

    /* set 评论内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /* get 评论内容 */
    public String getContent() {
        return content;
    }

    /* set 评论人的id */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /* get 评论人的id */
    public String getUserId() {
        return userId;
    }

    /* set 评论时间 */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /* get 评论时间 */
    public Date getSubmitTime() {
        return submitTime;
    }

    /* set 点赞次数 */
    public void setPushCount(Integer pushCount) {
        this.pushCount = pushCount;
    }

    /* get 点赞次数 */
    public Integer getPushCount() {
        return pushCount;
    }

    /* set 回复内容 */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /* get 回复内容 */
    public String getReply() {
        return reply;
    }

}
