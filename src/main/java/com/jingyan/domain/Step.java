package com.jingyan.domain;

import java.util.List;

public class Step {
    private String text;
//    private List<String> imgList;
    private String[] imgList;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getImgList() {
        return imgList;
    }

    public void setImgList(String[] imgList) {
        this.imgList = imgList;
    }

    public Step() {
    }


}
