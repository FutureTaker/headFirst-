package com.wangping.wzx.command.control;

import com.wangping.wzx.command.commandset.Command;
import com.wangping.wzx.command.commandset.NoCommand;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Future on 2019/2/17.
 */

@Data
@Slf4j
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(final int slotSize) {
        onCommands = new Command[slotSize];
        offCommands = new Command[slotSize];

        Arrays.stream(onCommands).forEach( command ->  { command = new NoCommand(); });
        Arrays.stream(offCommands).forEach( command -> { command = new NoCommand(); });
    }

    public void setCommand(int slot , Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }
}
