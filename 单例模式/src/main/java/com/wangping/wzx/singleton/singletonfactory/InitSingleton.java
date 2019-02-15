package com.wangping.wzx.singleton.singletonfactory;

/**
 * Created by Future on 2019/2/15.
 */
public class InitSingleton {

    private final static InitSingleton initSingleton = new InitSingleton();

    private InitSingleton() {

    }

    public static InitSingleton getInstance() {
        return initSingleton;
    }
}
