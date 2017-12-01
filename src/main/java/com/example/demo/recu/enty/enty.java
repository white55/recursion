package com.example.demo.recu.enty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张超 on 2017/11/30.
 */

public class enty {
    private String father;
    private String son;
    private List<enty> childList=new ArrayList<>();

    public List<enty> getChildList() {
        return childList;
    }

    public void setChildList(List<enty> childList) {
        this.childList = childList;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }
}
