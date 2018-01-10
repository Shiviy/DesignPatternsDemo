package com.demo.leo.designparttens.Factory;

/**
 * 某车型的工厂方法
 * Created by leo on 2018/1/10.
 */

public abstract class AudiFactory {
    /**
     * 某车型的工厂方法
     *
     * @param clz 具体的SUV型号类型
     * @param <T> 具体型号的SUV车对象
     * @return
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
