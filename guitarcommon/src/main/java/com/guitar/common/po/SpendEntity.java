package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* spend 表 Pojo
*/
@Table(name = "spend")
public class SpendEntity {
    /* 主键id */
    private String id;
    /* 支出项 */
    private String spendName;
    /* 支出金额 */
    private String spendCost;
    /* 支出细项 */
    private String spendItemId;
    /* 支出图片 */
    private String img;
    /*  */
    private Date spendTime;
    /* 处理人员 */
    private String dealPersonId;
    /* 支出项目，指线上还是线下 */
    private Integer spendSource;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 支出项 */
    public void setSpendName(String spendName) {
        this.spendName = spendName;
    }

    /* get 支出项 */
    public String getSpendName() {
        return spendName;
    }

    /* set 支出金额 */
    public void setSpendCost(String spendCost) {
        this.spendCost = spendCost;
    }

    /* get 支出金额 */
    public String getSpendCost() {
        return spendCost;
    }

    /* set 支出细项 */
    public void setSpendItemId(String spendItemId) {
        this.spendItemId = spendItemId;
    }

    /* get 支出细项 */
    public String getSpendItemId() {
        return spendItemId;
    }

    /* set 支出图片 */
    public void setImg(String img) {
        this.img = img;
    }

    /* get 支出图片 */
    public String getImg() {
        return img;
    }

    /* set  */
    public void setSpendTime(Date spendTime) {
        this.spendTime = spendTime;
    }

    /* get  */
    public Date getSpendTime() {
        return spendTime;
    }

    /* set 处理人员 */
    public void setDealPersonId(String dealPersonId) {
        this.dealPersonId = dealPersonId;
    }

    /* get 处理人员 */
    public String getDealPersonId() {
        return dealPersonId;
    }

    /* set 支出项目，指线上还是线下 */
    public void setSpendSource(Integer spendSource) {
        this.spendSource = spendSource;
    }

    /* get 支出项目，指线上还是线下 */
    public Integer getSpendSource() {
        return spendSource;
    }

}
