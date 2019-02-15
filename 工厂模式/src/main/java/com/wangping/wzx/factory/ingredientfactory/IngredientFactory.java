package com.wangping.wzx.factory.ingredientfactory;

import java.util.List;

/**
 * Created by Future on 2019/2/14.
 */
public interface IngredientFactory {
    String createDough();

    String createSauce();

    List<String> createToppings();
}
