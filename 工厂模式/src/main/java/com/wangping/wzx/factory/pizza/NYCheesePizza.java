package com.wangping.wzx.factory.pizza;

import com.wangping.wzx.factory.ingredientfactory.IngredientFactory;
import lombok.Data;

/**
 * Created by Future on 2019/2/14.
 */

@Data
public class NYCheesePizza extends Pizza {

    private IngredientFactory ingredientFactory;

    public NYCheesePizza(IngredientFactory ingredientFactory) {
        name = "纽约芝士风味比萨";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        toppings = ingredientFactory.createToppings();
    }
}
