package com.wangping.wzx.strategy.behaviors.impl.swim;

import com.wangping.wzx.strategy.behaviors.Swimable;

/**
 * Created by Future on 2019/2/7.
 */
public class ButterFlyStroke implements Swimable {

    @Override
    public void swim() {
        System.out.println("使用蝶泳姿势游泳");
    }
}
