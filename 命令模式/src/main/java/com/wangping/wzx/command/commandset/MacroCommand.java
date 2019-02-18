package com.wangping.wzx.command.commandset;

/**
 * Created by Future on 2019/2/17.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command: commands) {
            command.execute();
        }
    }
}
