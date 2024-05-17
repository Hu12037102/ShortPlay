package com.inshort.base.entity;

/**
 * @author: 张勇
 * @date: 2024/5/17
 */
public class MyListTypeEntity {

    private String type;
    private boolean isSelect;

    public MyListTypeEntity(String type, boolean isSelect) {
        this.type = type;
        this.isSelect = isSelect;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }
}
