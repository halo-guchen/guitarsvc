package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* data 表 Pojo
*/
@Table(name = "data")
public class DataEntity {
    /* 资料的id */
    private String id;
    /* 资料的标题 */
    private String tittle;
    /* 上传时间 */
    private Date uploadTime;
    /* 发布时间 */
    private Date publishTime;
    /* 资料的链接地址 */
    private String url;


    /* set 资料的id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 资料的id */
    public String getId() {
        return id;
    }

    /* set 资料的标题 */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    /* get 资料的标题 */
    public String getTittle() {
        return tittle;
    }

    /* set 上传时间 */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /* get 上传时间 */
    public Date getUploadTime() {
        return uploadTime;
    }

    /* set 发布时间 */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /* get 发布时间 */
    public Date getPublishTime() {
        return publishTime;
    }

    /* set 资料的链接地址 */
    public void setUrl(String url) {
        this.url = url;
    }

    /* get 资料的链接地址 */
    public String getUrl() {
        return url;
    }

}
