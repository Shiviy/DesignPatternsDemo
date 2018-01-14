package com.demo.leo.designparttens.strategy;

/**
 * 具体的策略实现类 公交车价格计算
 * Created by leo on 2018/1/14.
 */

public class BusStrategy implements CalculateStrategy {
    /**
     * 公交车价格 10公里以内1元，超过10公里每加一元可以乘5公里
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        //超过10公里的距离
        int extraTotal = km - 10;
        //超过的距离是5的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
