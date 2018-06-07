package com.itunion.shop.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ShopGoodsRespDto implements Serializable{

    private static final long serialVersionUID = -2468993595716577398L;
    private Integer id;

    private String name;

    private BigDecimal price;

    private BigDecimal privilegePrice;

    private String imgUrl;

    private String details;

    private String remark;

    private Date createDate;

    private Date updateDate;

    private Integer clickRate;

    private Integer buyRate;

    private Integer stock;

    private String isHot;

    private String isNew;

    private Integer classifyId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrivilegePrice() {
        return privilegePrice;
    }

    public void setPrivilegePrice(BigDecimal privilegePrice) {
        this.privilegePrice = privilegePrice;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDesc() {
        return remark;
    }

    public void setDesc(String desc) {
        this.remark = desc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getClickRate() {
        return clickRate;
    }

    public void setClickRate(Integer clickRate) {
        this.clickRate = clickRate;
    }

    public Integer getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(Integer buyRate) {
        this.buyRate = buyRate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    @Override
    public String toString() {
        return "ShopGoodsRespDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", privilegePrice=" + privilegePrice +
                ", imgUrl='" + imgUrl + '\'' +
                ", details='" + details + '\'' +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", clickRate=" + clickRate +
                ", buyRate=" + buyRate +
                ", stock=" + stock +
                ", isHot='" + isHot + '\'' +
                ", isNew='" + isNew + '\'' +
                ", classifyId=" + classifyId +
                '}';
    }
}