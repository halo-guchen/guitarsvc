package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* income_item 表 Pojo
*/
@Table(name = "income_item")
public class IncomeItemEntity {
    /* 主键 */
    private String id;
    /* 收入名字 */
    private String name;
    /* 收入描述 */
    private String description;
    /* 收入id */
    private String incomeId;


    /* set 主键 */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键 */
    public String getId() {
        return id;
    }

    /* set 收入名字 */
    public void setName(String name) {
        this.name = name;
    }

    /* get 收入名字 */
    public String getName() {
        return name;
    }

    /* set 收入描述 */
    public void setDescription(String description) {
        this.description = description;
    }

    /* get 收入描述 */
    public String getDescription() {
        return description;
    }

    /* set 收入id */
    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    /* get 收入id */
    public String getIncomeId() {
        return incomeId;
    }

}
