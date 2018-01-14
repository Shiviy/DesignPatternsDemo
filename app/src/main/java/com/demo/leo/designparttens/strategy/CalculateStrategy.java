package com.demo.leo.designparttens.strategy;

/**
 * 计算接口 即strategy接口
 * Created by leo on 2018/1/14.
 */

public interface CalculateStrategy {
    /**
     * 根据距离来计算价格
     *
     * @param km 公里
     * @return
     */
    int calculatePrice(int km);
}
