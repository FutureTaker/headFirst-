package com.wangping.wzx.observer.subject;

import com.wangping.wzx.observer.view.DisplayView;

/**
 * Created by Future on 2019/2/8.
 */
public interface PublishSubject {

    /**
     * 注册发布者
     */
    boolean registerObserver(DisplayView displayView);

    /**
     * 移除发布者
     */
    boolean removeObserver(DisplayView displayView);

    /**
     * 向所有发布者发消息
     */
    void notifyAllObservers();

}
