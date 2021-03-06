package com.wangping.wzx.command.commandset;

import com.wangping.wzx.command.toolset.ElectircFan;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class ElectricFanMidCommand implements Command {

    private ElectircFan electircFan;

    public ElectricFanMidCommand(ElectircFan electircFan) {
        this.electircFan = electircFan;
    }

    @Override
    public void execute() {
        electircFan.mid();
    }
}
