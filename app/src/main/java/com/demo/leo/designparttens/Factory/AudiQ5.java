package com.demo.leo.designparttens.Factory;

/**
 * Created by leo on 2018/1/10.
 */

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5启动啦！");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5开始自动巡航");
    }
}
