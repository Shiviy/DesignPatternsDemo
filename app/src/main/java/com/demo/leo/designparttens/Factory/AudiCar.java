package com.demo.leo.designparttens.Factory;

/**
 * 汽车的抽象产品类
 * Created by leo on 2018/1/10.
 */

public abstract class AudiCar {
    /**
     * 定义汽车的一个行为方法 车可以开
     */
    public abstract void drive();

    /**
     * 定义汽车的一个行为方法 车可以自动巡航
     */
    public abstract void selfNavigation();
}
