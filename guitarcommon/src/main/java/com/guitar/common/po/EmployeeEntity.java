package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* employee 表 Pojo
* Auto Created by Leo_Chan 2016-10-31 10:04:41
*/
@Table(name = "employee")
public class EmployeeEntity {
    /* 主键id */
    private String id;
    /* 员工姓名 */
    private String name;
    /* 员工的电话 */
    private String mobile;
    /* 员工的照片 */
    private String img;
    /* 员工的邮箱 */
    private String email;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 员工姓名 */
    public void setName(String name) {
        this.name = name;
    }

    /* get 员工姓名 */
    public String getName() {
        return name;
    }

    /* set 员工的电话 */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /* get 员工的电话 */
    public String getMobile() {
        return mobile;
    }

    /* set 员工的照片 */
    public void setImg(String img) {
        this.img = img;
    }

    /* get 员工的照片 */
    public String getImg() {
        return img;
    }

    /* set 员工的邮箱 */
    public void setEmail(String email) {
        this.email = email;
    }

    /* get 员工的邮箱 */
    public String getEmail() {
        return email;
    }

}
