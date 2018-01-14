package com.demo.leo.designparttens.strategy;

/**
 * 具体的策略实现类 地铁价格计算
 * Created by leo on 2018/1/14.
 */

public class SubwayStrategy implements CalculateStrategy {
    /**
     * 6公里内3元；6～12公里4元；12～22公里5元；22～32公里6元；超过32公里7元
     *
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km <= 12) {
            return 4;
        } else if (km <= 22) {
            return 5;
        } else if (km < 32) {
            return 6;
        }
        return 7;
    }
}
