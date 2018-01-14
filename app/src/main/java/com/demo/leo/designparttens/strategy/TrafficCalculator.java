package com.demo.leo.designparttens.strategy;

/**
 * 扮演Context类 用来操作策略的上下文环境
 * Created by leo on 2018/1/14.
 */

public class TrafficCalculator {
    private CalculateStrategy mStrategy;

    public void setmStrategy(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        TrafficCalculator trafficCalculator = new TrafficCalculator();
        trafficCalculator.setmStrategy(new TaxiStrategy());
        System.out.println("出租车乘16公里的价格：" + trafficCalculator.calculatePrice(16));
    }
}
