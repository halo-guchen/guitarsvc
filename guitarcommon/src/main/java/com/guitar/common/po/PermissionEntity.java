package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* permission 表 Pojo
*/
@Table(name = "permission")
public class PermissionEntity {
    /* 权限表的id */
    private Integer id;
    /* 权限的名称 */
    private String name;
    /* 权限的范围 */
    private String scope;
    /* 是否可用 */
    private Integer enable;


    /* set 权限表的id */
    public void setId(Integer id) {
        this.id = id;
    }

    /* get 权限表的id */
    public Integer getId() {
        return id;
    }

    /* set 权限的名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* get 权限的名称 */
    public String getName() {
        return name;
    }

    /* set 权限的范围 */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /* get 权限的范围 */
    public String getScope() {
        return scope;
    }

    /* set 是否可用 */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /* get 是否可用 */
    public Integer getEnable() {
        return enable;
    }

}
