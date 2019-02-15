package com.wangping.wzx.singleton.singletonfactory;

/**
 * Created by Future on 2019/2/15.
 */
public class SynerSingleton {

    private volatile static SynerSingleton threadUnsafeSingleton;

    private SynerSingleton() {

    }

    public static SynerSingleton getInstance() {
        if(threadUnsafeSingleton == null) {
            synchronized (SynerSingleton.class) {
                if(threadUnsafeSingleton == null) {
                    threadUnsafeSingleton = new SynerSingleton();
                }
            }
        }

        return threadUnsafeSingleton;
    }
}
