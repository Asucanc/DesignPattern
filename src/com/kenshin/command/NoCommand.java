package com.kenshin.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("this is execute of a noCommand");
    }

    @Override
    public void undo() {
        System.out.println("this is undo of a noCommand");
    }
}
