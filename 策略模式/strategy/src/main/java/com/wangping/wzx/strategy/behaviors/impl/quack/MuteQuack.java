package com.wangping.wzx.strategy.behaviors.impl.quack;

import com.wangping.wzx.strategy.behaviors.Quackable;

/**
 * Created by Future on 2019/2/7.
 */
public class MuteQuack implements Quackable {

    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
