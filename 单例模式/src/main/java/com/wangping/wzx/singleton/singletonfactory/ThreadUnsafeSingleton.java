package com.wangping.wzx.singleton.singletonfactory;

/**
 * Created by Future on 2019/2/15.
 */
public class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton threadUnsafeSingleton;

    private ThreadUnsafeSingleton() {

    }

    public static ThreadUnsafeSingleton getInstance() {
        if(threadUnsafeSingleton == null) {
            threadUnsafeSingleton = new ThreadUnsafeSingleton();
        }

        return threadUnsafeSingleton;
    }

}
