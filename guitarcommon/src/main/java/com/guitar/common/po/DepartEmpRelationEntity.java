package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* depart_emp_relation 表 Pojo
*/
@Table(name = "depart_emp_relation")
public class DepartEmpRelationEntity {
    /*  */
    private String id;
    /* 部门id */
    private String departmentId;
    /* 员工id */
    private String employeeId;
    /* 父级部门 */
    private String departmentParentId;


    /* set  */
    public void setId(String id) {
        this.id = id;
    }

    /* get  */
    public String getId() {
        return id;
    }

    /* set 部门id */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /* get 部门id */
    public String getDepartmentId() {
        return departmentId;
    }

    /* set 员工id */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /* get 员工id */
    public String getEmployeeId() {
        return employeeId;
    }

    /* set 父级部门 */
    public void setDepartmentParentId(String departmentParentId) {
        this.departmentParentId = departmentParentId;
    }

    /* get 父级部门 */
    public String getDepartmentParentId() {
        return departmentParentId;
    }

}
