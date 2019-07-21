package com.kenshin.command;

import java.util.Arrays;

public class RemoteControlWithUndo {
    private int length = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        this.onCommands = new Command[length];
        this.offCommands = new Command[length];
        // 定义空对象防止出现空指针的情况
        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++ ) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) throws Exception {
        if (slot >= 0 && slot < length) {
            this.onCommands[slot] = onCommand;
            this.offCommands[slot] = offCommand;
        } else {
            throw new Exception("slot out range");
        }
    }

    public void onButtonWasPressed(int slot) throws Exception {
        System.out.println("[On] button is pressed");
        if (slot >= 0 && slot < length) {
            this.onCommands[slot].execute();
            undoCommand = this.onCommands[slot];
        } else {
            throw new Exception("slot out range");
        }
    }

    public void offButtonWasPressed(int slot) throws Exception {
        System.out.println("[Off] button is pressed");
        if (slot >= 0 && slot < length) {
            this.offCommands[slot].execute();
            undoCommand = this.offCommands[slot];
        } else {
            throw new Exception("slot out range");
        }
    }

    public void undoButtonPressed() throws Exception {
        System.out.println("[Undo] button is pressed");
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "length=" + length +
                ", onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
