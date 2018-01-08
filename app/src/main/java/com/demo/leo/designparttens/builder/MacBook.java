package com.demo.leo.designparttens.builder;

/**
 * 具体的Computer实现类
 * Created by leo on 2018/1/8.
 */

public class MacBook extends Computer {
    protected MacBook() {
    }

    @Override
    public void setmOS() {
        mOS = "Mac OS x 10.10";
    }
}
