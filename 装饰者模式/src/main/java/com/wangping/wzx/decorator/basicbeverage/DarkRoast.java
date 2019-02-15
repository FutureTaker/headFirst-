package com.wangping.wzx.decorator.basicbeverage;

import com.wangping.wzx.decorator.Beverage;

/**
 * Created by Future on 2019/2/10.
 */
public class DarkRoast implements Beverage {

    private final double DARK_ROAST_PRICE = 3.99;

    @Override
    public String getDescription() {
        return "DarkRoast";
    }

    @Override
    public double cost() {
        return DARK_ROAST_PRICE;
    }
}
