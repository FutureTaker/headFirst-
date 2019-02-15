package com.wangping.wzx.factory;

import com.wangping.wzx.factory.pizzastroe.NYPizzaStore;
import com.wangping.wzx.factory.pizzastroe.PizzaStore;
import com.wangping.wzx.factory.pizzastroe.SHPizzaStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {

		// 去纽约风格的店去订阅芝士pizza
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");

		// 去上海风格店去订阅芝士pizza
		PizzaStore shPizzaStore = new SHPizzaStore();
		shPizzaStore.orderPizza("cheese");

		SpringApplication.run(FactoryApplication.class, args);
	}

}

