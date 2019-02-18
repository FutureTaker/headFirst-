package com.wangping.wzx.command.commandset;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class NoCommand implements Command {

    @Override
    public void execute() {

    }
}
