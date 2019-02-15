package com.wangping.wzx.decorator;

import io.swagger.annotations.Api;

/**
 * Created by Future on 2019/2/10.
 */

@Api("饮料类")
public interface Beverage {

    String getDescription();

    double cost();
}
