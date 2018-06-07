package com.itunion.shop.dto;


public class ShopGoodsReqListDto {

    private Long developerId;
    private String isHot;
    private String isNew;
    private String scope;
    private int page = 1;
    private int size = 10;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Long developerId) {
        this.developerId = developerId;
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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "ShopGoodsReqListDto{" +
                "developerId=" + developerId +
                ", isHot='" + isHot + '\'' +
                ", isNew='" + isNew + '\'' +
                ", scope='" + scope + '\'' +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}