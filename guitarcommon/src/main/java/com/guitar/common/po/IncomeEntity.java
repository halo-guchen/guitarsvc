package com.guitar.common.po;

import java.util.Date;

import javax.persistence.Table;

/*
* income 表 Pojo
* Auto Created by Leo_Chan 2016-10-31 10:04:41
*/
@Table(name = "income")
public class IncomeEntity {
    /* 主键id */
    private String id;
    /* 收入项 */
    private String incomeName;
    /* 进账数目 */
    private String incomeCost;
    /* 收入细化项 */
    private String incomeItemsId;
    /* 收入图片 */
    private String img;
    /* 收入时间 */
    private Date incomeTime;
    /* 收入来源项，指的线上还是线下 */
    private Integer incomeSource;
    /* 收入引入人 */
    private String incomePersonId;


    /* set 主键id */
    public void setId(String id) {
        this.id = id;
    }

    /* get 主键id */
    public String getId() {
        return id;
    }

    /* set 收入项 */
    public void setIncomeName(String incomeName) {
        this.incomeName = incomeName;
    }

    /* get 收入项 */
    public String getIncomeName() {
        return incomeName;
    }

    /* set 进账数目 */
    public void setIncomeCost(String incomeCost) {
        this.incomeCost = incomeCost;
    }

    /* get 进账数目 */
    public String getIncomeCost() {
        return incomeCost;
    }

    /* set 收入细化项 */
    public void setIncomeItemsId(String incomeItemsId) {
        this.incomeItemsId = incomeItemsId;
    }

    /* get 收入细化项 */
    public String getIncomeItemsId() {
        return incomeItemsId;
    }

    /* set 收入图片 */
    public void setImg(String img) {
        this.img = img;
    }

    /* get 收入图片 */
    public String getImg() {
        return img;
    }

    /* set 收入时间 */
    public void setIncomeTime(Date incomeTime) {
        this.incomeTime = incomeTime;
    }

    /* get 收入时间 */
    public Date getIncomeTime() {
        return incomeTime;
    }

    /* set 收入来源项，指的线上还是线下 */
    public void setIncomeSource(Integer incomeSource) {
        this.incomeSource = incomeSource;
    }

    /* get 收入来源项，指的线上还是线下 */
    public Integer getIncomeSource() {
        return incomeSource;
    }

    /* set 收入引入人 */
    public void setIncomePersonId(String incomePersonId) {
        this.incomePersonId = incomePersonId;
    }

    /* get 收入引入人 */
    public String getIncomePersonId() {
        return incomePersonId;
    }

}
