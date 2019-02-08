package com.wangping.wzx.strategy.model;

import com.wangping.wzx.strategy.behaviors.Flyable;
import com.wangping.wzx.strategy.behaviors.Quackable;
import com.wangping.wzx.strategy.behaviors.Swimable;
import lombok.Data;

/**
 * Created by Future on 2019/2/7.
 */
@Data
public abstract class Duck {
    Flyable flyBehavior;

    Quackable quackBehavoir;

    Swimable swimBehavoir;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavoir.quack();
    }

    public void performSwim() {
        swimBehavoir.swim();
    }

    public abstract void display();
}
