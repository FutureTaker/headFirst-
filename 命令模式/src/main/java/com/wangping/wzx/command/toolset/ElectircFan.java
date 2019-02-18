package com.wangping.wzx.command.toolset;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Slf4j
@Data
public class ElectircFan {

    public void on() {
        log.info("电风扇打开到低档");
    }

    public void mid() {
        log.info("电风扇打开到中档");
    }

    public void high() {
        log.info("电风扇打开到高档");
    }

    public void off() {
        log.info("关闭电风扇");
    }
}
