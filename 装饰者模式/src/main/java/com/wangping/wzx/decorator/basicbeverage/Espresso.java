package com.wangping.wzx.decorator.basicbeverage;

import com.wangping.wzx.decorator.Beverage;

/**
 * Created by Future on 2019/2/10.
 */
public class Espresso implements Beverage {

    private final double ESPRESSO_PRICE = 0.19;

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return ESPRESSO_PRICE;
    }
}
