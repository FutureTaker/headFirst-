package com.wangping.wzx.factory.ingredientfactory;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * Created by Future on 2019/2/14.
 */

@Data
public class SHIngredientFactory implements IngredientFactory {

    @Override
    public String createDough() {
        return "芝加哥薄饼";
    }

    @Override
    public String createSauce() {
        return "大蒜酱料";
    }

    @Override
    public List<String> createToppings() {
        List<String> toppings = Lists.newArrayList();
        toppings.add("芝士");
        toppings.add("胡椒");
        return toppings;
    }
}
