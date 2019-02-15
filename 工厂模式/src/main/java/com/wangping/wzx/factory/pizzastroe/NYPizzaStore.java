package com.wangping.wzx.factory.pizzastroe;

import com.wangping.wzx.factory.ingredientfactory.IngredientFactory;
import com.wangping.wzx.factory.ingredientfactory.NYIngredientFactory;
import com.wangping.wzx.factory.pizza.*;
import lombok.Data;

/**
 * Created by Future on 2019/2/14.
 */

@Data
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        final IngredientFactory ingredientFactory = new NYIngredientFactory();

        if("cheese".equals(type)) {
            return new NYCheesePizza(ingredientFactory);
        }

        if("pepperoni".equals(type)) {
            return new NYPepperoniPizza();
        }

        if("clam".equals(type)) {
            return new NYClamPizza();
        }

        if("veggie".equals(type)) {
            return new NYVeggiePizza();
        }

        return new NYCheesePizza(ingredientFactory);
    }
}
