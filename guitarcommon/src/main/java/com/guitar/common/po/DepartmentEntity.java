package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* department 表 Pojo
*/
@Table(name = "department")
public class DepartmentEntity {
    /* 主键id */
    private String id;
    /* 部门名称 */
    private String departmentName;
    /* 部门负责人 */
    private String departmentMajor;
    /* 部门职责 */
    private String departmentRepository;
    /* 创建时间 */
    private Date createTime;
    /* 部门公告 */
    private String taskId;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 部门名称 */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /* get 部门名称 */
    public String getDepartmentName() {
        return departmentName;
    }

    /* set 部门负责人 */
    public void setDepartmentMajor(String departmentMajor) {
        this.departmentMajor = departmentMajor;
    }

    /* get 部门负责人 */
    public String getDepartmentMajor() {
        return departmentMajor;
    }

    /* set 部门职责 */
    public void setDepartmentRepository(String departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    /* get 部门职责 */
    public String getDepartmentRepository() {
        return departmentRepository;
    }

    /* set 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* get 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* set 部门公告 */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /* get 部门公告 */
    public String getTaskId() {
        return taskId;
    }

}
