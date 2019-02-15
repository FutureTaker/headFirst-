package com.wangping.wzx.factory.ingredientfactory;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * Created by Future on 2019/2/14.
 */

@Data
public class NYIngredientFactory implements IngredientFactory {

    @Override
    public String createDough() {
        return "纽约薄饼";
    }

    @Override
    public String createSauce() {
        return "番茄酱料";
    }

    @Override
    public List<String> createToppings() {
        List<String> toppings = Lists.newArrayList();
        toppings.add("芝士");
        toppings.add("土豆");
        return toppings;
    }
}
