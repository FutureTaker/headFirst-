package com.wangping.wzx.decorator.basicbeverage;

import com.wangping.wzx.decorator.Beverage;

/**
 * Created by Future on 2019/2/10.
 */
public class Decat implements Beverage {

    private final double DECAT_PRICE = 5.99;

    @Override
    public String getDescription() {
        return "Decat";
    }

    @Override
    public double cost() {
        return DECAT_PRICE;
    }
}
