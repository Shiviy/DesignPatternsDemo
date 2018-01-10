package com.demo.leo.designparttens.Factory;

/**
 * Created by leo on 2018/1/10.
 */

public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7开始自动巡航");
    }
}
