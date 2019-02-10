package com.wangping.wzx.observer.subject;

import com.wangping.wzx.observer.view.DisplayView;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Future on 2019/2/8.
 */

@Data
public class WeathData implements PublishSubject {

    @ApiModelProperty("温度")
    private float temp;

    @ApiModelProperty("湿度")
    private float humidity;

    @ApiModelProperty("压力")
    private float pressure;

    private final List<DisplayView> displayViewList = new ArrayList<>();

    @Override
    public boolean registerObserver(DisplayView displayView) {
        return displayViewList.add(displayView);
    }

    @Override
    public boolean removeObserver(DisplayView displayView) {
        for(DisplayView dv: displayViewList) {
            if(displayView == dv) {
                return displayViewList.remove(displayView);
            }
        }

        return true;
    }

    @Override
    public void notifyAllObservers() {
        displayViewList.stream().forEach( v -> {
            v.update(temp,humidity,pressure);
        });
    }

    public void setMeasureMent(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObservers();
    }
}
