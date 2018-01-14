package com.demo.leo.designparttens.strategy;

/**
 * 策略的具体实现 出租车价格计算
 * Created by leo on 2018/1/14.
 */

public class TaxiStrategy implements CalculateStrategy {
    /**
     * 公里数*2
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
