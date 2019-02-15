package com.wangping.wzx.decorator.condimentdecorator;

import com.wangping.wzx.decorator.Beverage;
import lombok.Data;

/**
 * Created by Future on 2019/2/10.
 */

@Data
public class Mocha implements Beverage {

    private final Double MOCHA_PRICE = 0.1;

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + MOCHA_PRICE;
    }
}
