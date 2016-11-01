package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* user_action 表 Pojo
*/
@Table(name = "user_action")
public class UserActionEntity {
    /* 主键id */
    private String id;
    /*  */
    private String userId;
    /* 上次登陆时间 */
    private Date lastLoginTime;
    /* 上次登出时间 */
    private Date lastLogoutTime;
    /* 登陆次数 */
    private Integer loginCount;
    /* 注册时间 */
    private Date registTime;
    /* 上次修改时间 */
    private Date lastModifiedTime;
    /* 上次修改人的人名 */
    private String lastModifiedUserName;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set  */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /* get  */
    public String getUserId() {
        return userId;
    }

    /* set 上次登陆时间 */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /* get 上次登陆时间 */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /* set 上次登出时间 */
    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    /* get 上次登出时间 */
    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    /* set 登陆次数 */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /* get 登陆次数 */
    public Integer getLoginCount() {
        return loginCount;
    }

    /* set 注册时间 */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    /* get 注册时间 */
    public Date getRegistTime() {
        return registTime;
    }

    /* set 上次修改时间 */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /* get 上次修改时间 */
    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /* set 上次修改人的人名 */
    public void setLastModifiedUserName(String lastModifiedUserName) {
        this.lastModifiedUserName = lastModifiedUserName;
    }

    /* get 上次修改人的人名 */
    public String getLastModifiedUserName() {
        return lastModifiedUserName;
    }

}
