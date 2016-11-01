package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* department_task 表 Pojo
*/
@Table(name = "department_task")
public class DepartmentTaskEntity {
    /* 主键id */
    private String id;
    /* 部门公告的标题 */
    private String title;
    /* 部门公告内容 */
    private String content;
    /* 部门id */
    private String departmentId;
    /* 状态标示，是否过期 */
    private Integer status;
    /* 创建时间 */
    private Date createTime;
    /* 创建人 */
    private String createPersonId;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 部门公告的标题 */
    public void setTitle(String title) {
        this.title = title;
    }

    /* get 部门公告的标题 */
    public String getTitle() {
        return title;
    }

    /* set 部门公告内容 */
    public void setContent(String content) {
        this.content = content;
    }

    /* get 部门公告内容 */
    public String getContent() {
        return content;
    }

    /* set 部门id */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /* get 部门id */
    public String getDepartmentId() {
        return departmentId;
    }

    /* set 状态标示，是否过期 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /* get 状态标示，是否过期 */
    public Integer getStatus() {
        return status;
    }

    /* set 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* get 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* set 创建人 */
    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId;
    }

    /* get 创建人 */
    public String getCreatePersonId() {
        return createPersonId;
    }

}
