package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* employee_task 表 Pojo
* Auto Created by Leo_Chan 2016-10-31 10:04:41
*/
@Table(name = "employee_task")
public class EmployeeTaskEntity {
    /* 主键id */
    private String id;
    /* 标题 */
    private String title;
    /* 内容 */
    private String content;
    /* 图片的url地址 */
    private String img;
    /* 处理状态 */
    private Integer status;
    /* 员工id */
    private String employeeId;
    /* 创建时间 */
    private Date createTime;
    /* 处理时间 */
    private Date dealTime;
    /* 回复内容 */
    private String replys;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /* get 标题 */
    public String getTitle() {
        return title;
    }

    /* set 内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /* get 内容 */
    public String getContent() {
        return content;
    }

    /* set 图片的url地址 */
    public void setImg(String img) {
        this.img = img;
    }

    /* get 图片的url地址 */
    public String getImg() {
        return img;
    }

    /* set 处理状态 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /* get 处理状态 */
    public Integer getStatus() {
        return status;
    }

    /* set 员工id */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /* get 员工id */
    public String getEmployeeId() {
        return employeeId;
    }

    /* set 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* get 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* set 处理时间 */
    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    /* get 处理时间 */
    public Date getDealTime() {
        return dealTime;
    }

    /* set 回复内容 */
    public void setReplys(String replys) {
        this.replys = replys;
    }

    /* get 回复内容 */
    public String getReplys() {
        return replys;
    }

}
