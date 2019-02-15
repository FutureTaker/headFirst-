package com.wangping.wzx.factory.pizzastroe;

import com.wangping.wzx.factory.ingredientfactory.IngredientFactory;
import com.wangping.wzx.factory.ingredientfactory.SHIngredientFactory;
import com.wangping.wzx.factory.pizza.*;

/**
 * Created by Future on 2019/2/14.
 */
public class SHPizzaStore extends PizzaStore {
    
    @Override
    public Pizza createPizza(String type) {
        IngredientFactory ingredientFactory = new SHIngredientFactory();

        if("cheese".equals(type)) {
            return new SHCheesePizza(ingredientFactory);
        }

        if("pepperoni".equals(type)) {
            return new SHPepperoniPizza();
        }

        if("clam".equals(type)) {
            return new SHClamPizza();
        }

        if("veggie".equals(type)) {
            return new SHVeggiePizza();
        }

        return new SHCheesePizza(ingredientFactory);
    }
}
