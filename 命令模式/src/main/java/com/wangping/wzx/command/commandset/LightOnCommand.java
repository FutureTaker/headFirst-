package com.wangping.wzx.command.commandset;

import com.wangping.wzx.command.toolset.Light;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
