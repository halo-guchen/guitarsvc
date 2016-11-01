package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* spend_item 表 Pojo
*/
@Table(name = "spend_item")
public class SpendItemEntity {
    /* 主键id */
    private String id;
    /* 支出项名字 */
    private String name;
    /* 详细描述 */
    private String description;
    /* 支出id */
    private String spendId;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 支出项名字 */
    public void setName(String name) {
        this.name = name;
    }

    /* get 支出项名字 */
    public String getName() {
        return name;
    }

    /* set 详细描述 */
    public void setDescription(String description) {
        this.description = description;
    }

    /* get 详细描述 */
    public String getDescription() {
        return description;
    }

    /* set 支出id */
    public void setSpendId(String spendId) {
        this.spendId = spendId;
    }

    /* get 支出id */
    public String getSpendId() {
        return spendId;
    }

}
