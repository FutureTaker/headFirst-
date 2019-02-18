package com.wangping.wzx.command.toolset;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class Light {

    public void on() {
        log.info("打开点灯");
    }

    public void off() {
        log.info("关闭点灯");
    }
}
