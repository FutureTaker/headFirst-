package com.wangping.wzx.command.toolset;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class VCD {

    public void on() {
        log.info("打开VCD");
    }

    public void play() {
        log.info("播放影片");
    }

    public void pause() {
        log.info("停止VCD播放");
    }

    public void  off() {
        log.info("关闭VCD");
    }
}
