package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* menu 表 Pojo
*/
@Table(name = "menu")
public class MenuEntity {
    /* 菜单的id */
    private Integer id;
    /* 菜单编号 */
    private Integer menuNo;
    /* 父节点,如果0则为父节点 */
    private Integer parentId;
    /* 菜单的排序，从小到大排序 */
    private Integer menuOrder;
    /* 菜单的名称 */
    private String name;
    /* 菜单对应的权限，用，分割 */
    private String url;
    /* 权限id */
    private String permissionId;
    /* 是否可见，0为不可见，1为可见 */
    private Integer isvisiable;


    /* set 菜单的id */
    public void setId(Integer id) {
        this.id = id;
    }

    /* get 菜单的id */
    public Integer getId() {
        return id;
    }

    /* set 菜单编号 */
    public void setMenuNo(Integer menuNo) {
        this.menuNo = menuNo;
    }

    /* get 菜单编号 */
    public Integer getMenuNo() {
        return menuNo;
    }

    /* set 父节点,如果0则为父节点 */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /* get 父节点,如果0则为父节点 */
    public Integer getParentId() {
        return parentId;
    }

    /* set 菜单的排序，从小到大排序 */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /* get 菜单的排序，从小到大排序 */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /* set 菜单的名称 */
    public void setName(String name) {
        this.name = name;
    }

    /* get 菜单的名称 */
    public String getName() {
        return name;
    }

    /* set 菜单对应的权限，用，分割 */
    public void setUrl(String url) {
        this.url = url;
    }

    /* get 菜单对应的权限，用，分割 */
    public String getUrl() {
        return url;
    }

    /* set 权限id */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    /* get 权限id */
    public String getPermissionId() {
        return permissionId;
    }

    /* set 是否可见，0为不可见，1为可见 */
    public void setIsvisiable(Integer isvisiable) {
        this.isvisiable = isvisiable;
    }

    /* get 是否可见，0为不可见，1为可见 */
    public Integer getIsvisiable() {
        return isvisiable;
    }

}
