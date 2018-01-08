package com.demo.leo.designparttens.builder;

/**
 * 抽象Builder类
 * Created by leo on 2018/1/8.
 */

public abstract class Builder {
    //设置主机
    public abstract Builder buildBoard(String board);

    //设置显示器
    public abstract Builder buildDisplay(String display);

    //设置操作系统
    public abstract Builder buildOS();

    //创建Computer
    public abstract Computer create();

}