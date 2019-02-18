package com.wangping.wzx.command.commandset;

import com.wangping.wzx.command.toolset.VCD;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class VcdOffCommand implements Command {

    private VCD vcd;

    public VcdOffCommand(VCD vcd) {
        this.vcd = vcd;
    }

    @Override
    public void execute() {
        vcd.pause();
        vcd.off();
    }
}
