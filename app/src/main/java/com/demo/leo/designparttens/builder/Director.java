package com.demo.leo.designparttens.builder;

/**
 * Director类 负责构造Computer
 * Created by leo on 2018/1/8.
 */

public class Director {
    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
