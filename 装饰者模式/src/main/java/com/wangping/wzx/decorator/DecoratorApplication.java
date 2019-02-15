package com.wangping.wzx.decorator;

import com.wangping.wzx.decorator.basicbeverage.DarkRoast;
import com.wangping.wzx.decorator.basicbeverage.Espresso;
import com.wangping.wzx.decorator.condimentdecorator.Mocha;
import com.wangping.wzx.decorator.condimentdecorator.Soy;
import com.wangping.wzx.decorator.condimentdecorator.Whip;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		DarkRoast darkRoast = new DarkRoast();
		Beverage beverage = new Mocha(darkRoast);
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		System.out.println(beverage.getDescription() + "\n" + "$ " + beverage.cost());

		Beverage espressoBeverage = new Soy(new Whip(new Espresso()));
		System.out.println(espressoBeverage.getDescription() + "\n$ " + espressoBeverage.cost());

		SpringApplication.run(DecoratorApplication.class, args);
	}

}

