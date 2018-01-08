package com.demo.leo.designparttens.builder;

/**
 * 具体的Builder类， MacbookBuilder
 * Created by leo on 2018/1/8.
 */

public class MacbookBuilder extends Builder {

    private Computer mComputer = new MacBook();


    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setmOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
