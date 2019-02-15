package com.wangping.wzx.factory.pizzastroe;

import com.wangping.wzx.factory.pizza.Pizza;
import lombok.Data;

/**
 * Created by Future on 2019/2/14.
 */

@Data
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
