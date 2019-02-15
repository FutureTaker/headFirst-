package com.wangping.wzx.decorator.condimentdecorator;

import com.wangping.wzx.decorator.Beverage;
import lombok.Data;

/**
 * Created by Future on 2019/2/10.
 */

@Data
public class Soy implements Beverage {

    private final Double SOY_PRICE = 0.15;

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + SOY_PRICE;
    }
}
