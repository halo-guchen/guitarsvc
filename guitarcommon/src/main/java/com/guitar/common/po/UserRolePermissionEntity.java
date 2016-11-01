package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* user_role_permission 表 Pojo
*/
@Table(name = "user_role_permission")
public class UserRolePermissionEntity {
    /* 主键id */
    private String id;
    /* 角色id */
    private Integer roleId;
    /* 权限id */
    private Integer permissionId;
    /* 用户id */
    private String userId;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 角色id */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /* get 角色id */
    public Integer getRoleId() {
        return roleId;
    }

    /* set 权限id */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /* get 权限id */
    public Integer getPermissionId() {
        return permissionId;
    }

    /* set 用户id */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /* get 用户id */
    public String getUserId() {
        return userId;
    }

}
