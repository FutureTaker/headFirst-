package com.wangping.wzx.observer.view;

import com.wangping.wzx.observer.subject.WeathData;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Future on 2019/2/8.
 */
public class StatisticsDisplay implements DisplayView {

    @ApiModelProperty("订阅的主题")
    private WeathData weathData;

    @ApiModelProperty("温度")
    private float temp;

    @ApiModelProperty("压力")
    private float pressure;

    @ApiModelProperty("湿度")
    private float humidity;

    public StatisticsDisplay(WeathData weathData) {
        this.weathData = weathData;
        weathData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private void display() {
        System.out.println("这是统计显示屏。 当前温度是 : " + temp + ", 湿度是 ：" + humidity + ", 气压是 ： " + pressure);
    }
}
