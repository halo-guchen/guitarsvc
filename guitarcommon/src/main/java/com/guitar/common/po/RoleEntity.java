package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* role 表 Pojo
*/
@Table(name = "role")
public class RoleEntity {
    /* 角色id */
    private Integer id;
    /* 角色名称 */
    private String roleName;
    /* 状态，表示启用启用或禁用 */
    private Integer status;
    /* 创建角色人 */
    private String createUserId;
    /* 创建时间 */
    private Date createTime;
    /* 修改角色的人 */
    private String modifyUserId;
    /* 修改时间 */
    private Date modifyDate;


    /* set 角色id */
    public void setId(Integer id) {
        this.id = id;
    }

    /* get 角色id */
    public Integer getId() {
        return id;
    }

    /* set 角色名称 */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /* get 角色名称 */
    public String getRoleName() {
        return roleName;
    }

    /* set 状态，表示启用启用或禁用 */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /* get 状态，表示启用启用或禁用 */
    public Integer getStatus() {
        return status;
    }

    /* set 创建角色人 */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /* get 创建角色人 */
    public String getCreateUserId() {
        return createUserId;
    }

    /* set 创建时间 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /* get 创建时间 */
    public Date getCreateTime() {
        return createTime;
    }

    /* set 修改角色的人 */
    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    /* get 修改角色的人 */
    public String getModifyUserId() {
        return modifyUserId;
    }

    /* set 修改时间 */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /* get 修改时间 */
    public Date getModifyDate() {
        return modifyDate;
    }

}
