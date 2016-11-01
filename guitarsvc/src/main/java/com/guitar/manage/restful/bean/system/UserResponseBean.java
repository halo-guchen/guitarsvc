package com.guitar.manage.restful.bean.system;

public class UserResponseBean {
	
	 /* 用户id */
    private String id;
    /* 用户昵称 */
    private String userName;
    /* 用户手机号 */
    private String phone;
    /* 用户加盐，由用户的手机号去产生 */
    private String salt;
    /* 用户的等级值 */
    private Integer level;
    /* 用户角色，包括管理员，普通用户，vip用户 */
    private Integer roleId;
    /* 用户账户现金额，可以是平台的换算后的东西 */
    private Integer acount;
    /* 用户性别,1为男性，0为女性 */
    private Integer sex;
    /* 邮箱 */
    private String email;
    /* 昵称 */
    private String nickName;


    /* set 用户id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 用户id */
    public String getId() {
        return id;
    }

    /* set 用户昵称 */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /* get 用户昵称 */
    public String getUserName() {
        return userName;
    }

    /* set 用户手机号 */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* get 用户手机号 */
    public String getPhone() {
        return phone;
    }

    /* set 用户加盐，由用户的手机号去产生 */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /* get 用户加盐，由用户的手机号去产生 */
    public String getSalt() {
        return salt;
    }

    /* set 用户的等级值 */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /* get 用户的等级值 */
    public Integer getLevel() {
        return level;
    }

    /* set 用户角色，包括管理员，普通用户，vip用户 */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /* get 用户角色，包括管理员，普通用户，vip用户 */
    public Integer getRoleId() {
        return roleId;
    }

    /* set 用户账户现金额，可以是平台的换算后的东西 */
    public void setAcount(Integer acount) {
        this.acount = acount;
    }

    /* get 用户账户现金额，可以是平台的换算后的东西 */
    public Integer getAcount() {
        return acount;
    }

    /* set 用户性别,1为男性，0为女性 */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /* get 用户性别,1为男性，0为女性 */
    public Integer getSex() {
        return sex;
    }

    /* set 邮箱 */
    public void setEmail(String email) {
        this.email = email;
    }

    /* get 邮箱 */
    public String getEmail() {
        return email;
    }

    /* set 昵称 */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /* get 昵称 */
    public String getNickName() {
        return nickName;
    }

}
