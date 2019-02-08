package com.wangping.wzx.strategy;

import com.wangping.wzx.strategy.behaviors.Flyable;
import com.wangping.wzx.strategy.behaviors.Quackable;
import com.wangping.wzx.strategy.behaviors.Swimable;
import com.wangping.wzx.strategy.behaviors.impl.fly.FlyWithRocket;
import com.wangping.wzx.strategy.behaviors.impl.fly.FlyWithWings;
import com.wangping.wzx.strategy.behaviors.impl.quack.MuteQuack;
import com.wangping.wzx.strategy.behaviors.impl.quack.Squeak;
import com.wangping.wzx.strategy.behaviors.impl.swim.ButterFlyStroke;
import com.wangping.wzx.strategy.behaviors.impl.swim.FreeStyleStroke;
import com.wangping.wzx.strategy.model.MallardDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyDemoApplication.class, args);

		Flyable flyable = new FlyWithRocket();
		Quackable quackable = new MuteQuack();
		Swimable swimable = new ButterFlyStroke();

		MallardDuck mallardDuck = new MallardDuck(quackable,flyable,swimable);
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.performSwim();

		// 通过set动态改变绿头鸭行为
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavoir(new Squeak());
		mallardDuck.setSwimBehavoir(new FreeStyleStroke());

		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.performSwim();
	}
}

