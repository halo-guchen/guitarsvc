package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* role_permission 表 Pojo
*/
@Table(name = "role_permission")
public class RolePermissionEntity {
    /* 角色id */
    private Integer roleId;
    /* 权限id */
    private Integer permissionId;


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

}
