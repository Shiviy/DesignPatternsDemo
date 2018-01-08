package com.demo.leo.designparttens.builder;

/**
 * 具体的Builder类， MacbookBuilder
 * Created by leo on 2018/1/8.
 */

public class MacbookBuilder extends Builder {

    private Computer mComputer = new MacBook();


    @Override
    public Builder buildBoard(String board) {
        mComputer.setmBoard(board);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setmDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setmOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
