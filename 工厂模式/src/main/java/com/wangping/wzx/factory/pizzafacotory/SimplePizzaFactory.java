package com.wangping.wzx.factory.pizzafacotory;

import com.wangping.wzx.factory.pizza.*;

/**
 * Created by Future on 2019/2/14.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
       if("cheese".equals(type)) {
           return new CheesePizza();
       }

       if("pepperoni".equals(type)) {
           return new PepperoniPizza();
       }

       if("clam".equals(type)) {
           return new ClamPizza();
       }

       if("veggie".equals(type)) {
           return new VeggiePizza();
       }

       return new CheesePizza();
    }
}
