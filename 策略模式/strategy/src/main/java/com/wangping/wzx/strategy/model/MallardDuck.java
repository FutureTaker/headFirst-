package com.wangping.wzx.strategy.model;

import com.wangping.wzx.strategy.behaviors.Flyable;
import com.wangping.wzx.strategy.behaviors.Quackable;
import com.wangping.wzx.strategy.behaviors.Swimable;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/7.
 */

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck(Quackable quackable, Flyable flyable, Swimable swimable) {
        this.quackBehavoir = quackable;
        this.flyBehavior = flyable;
        this.swimBehavoir = swimable;
    }

    @Override
    public void display() {
        log.info("这是一只真正的绿头鸭");
    }
}
