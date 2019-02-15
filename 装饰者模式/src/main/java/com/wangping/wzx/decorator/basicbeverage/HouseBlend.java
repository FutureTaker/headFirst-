package com.wangping.wzx.decorator.basicbeverage;

import com.wangping.wzx.decorator.Beverage;

/**
 * Created by Future on 2019/2/10.
 */
public class HouseBlend implements Beverage {

    private final double HOUSEBLEND_PRICE = 0.29;

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return HOUSEBLEND_PRICE;
    }
}
