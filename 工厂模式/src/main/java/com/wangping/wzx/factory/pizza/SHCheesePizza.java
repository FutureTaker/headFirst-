package com.wangping.wzx.factory.pizza;

import com.wangping.wzx.factory.ingredientfactory.IngredientFactory;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/14.
 */

@Data
@Slf4j
public class SHCheesePizza extends Pizza {

    private IngredientFactory ingredientFactory;

    public SHCheesePizza(IngredientFactory ingredientFactory) {
        name = "上海芝士风味披萨";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void cut() {
        log.info("把比萨切成方形");
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings = ingredientFactory.createToppings();
    }
}
