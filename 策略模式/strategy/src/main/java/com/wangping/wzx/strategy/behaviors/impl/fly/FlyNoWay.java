package com.wangping.wzx.strategy.behaviors.impl.fly;

import com.wangping.wzx.strategy.behaviors.Flyable;

/**
 * Created by Future on 2019/2/7.
 */
public class FlyNoWay implements Flyable {

    @Override
    public void fly() {
        System.out.println("没有翅膀，在路上行走，不会飞");
    }
}
