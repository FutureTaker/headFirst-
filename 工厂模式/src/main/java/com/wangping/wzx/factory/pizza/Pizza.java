package com.wangping.wzx.factory.pizza;

import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by Future on 2019/2/14.
 */

@Data
@Slf4j
public abstract class Pizza {

    protected String name;

    @ApiModelProperty("面团")
    protected String dough;

    @ApiModelProperty("酱料")
    protected String sauce;

    @ApiModelProperty("佐料")
    protected List<String> toppings = Lists.newArrayList();

    public void prepare() {
        log.info("加各种调料");
    }

    public void bake() {
        log.info("300度烘焙25分钟");
    }

    public void cut() {
        log.info("把披萨切成扇形");
    }

    public void box() {
        log.info("pizza装盒");
    }
}
