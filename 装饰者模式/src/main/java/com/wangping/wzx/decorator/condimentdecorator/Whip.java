package com.wangping.wzx.decorator.condimentdecorator;

import com.wangping.wzx.decorator.Beverage;
import lombok.Data;

/**
 * Created by Future on 2019/2/10.
 */
@Data
public class Whip implements Beverage {

    private final double WHIP_PRICE = 0.3;

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + WHIP_PRICE;
    }
}
