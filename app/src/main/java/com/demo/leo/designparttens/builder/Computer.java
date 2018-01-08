package com.demo.leo.designparttens.builder;

/**
 * 计算机抽象类即 Product角色
 * Created by leo on 2018/1/8.
 */

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public void setmOS() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
