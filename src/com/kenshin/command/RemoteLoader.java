package com.kenshin.command;

/**
 * this is the command test class
 */
public class RemoteLoader {
    public static void main(String[] args) throws Exception {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("living room");
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Light kitchenLight = new Light("kitchen");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFan ceilingFan = new CeilingFan("living room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand  = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControlWithUndo.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControlWithUndo.setCommand(2, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(5, ceilingFanOffCommand,ceilingFanOffCommand);

        remoteControlWithUndo.onButtonWasPressed(0);
        remoteControlWithUndo.offButtonWasPressed(0);
        remoteControlWithUndo.onButtonWasPressed(1);
        remoteControlWithUndo.offButtonWasPressed(1);
        remoteControlWithUndo.undoButtonPressed();

        remoteControlWithUndo.onButtonWasPressed(3);
        remoteControlWithUndo.onButtonWasPressed(2);
        remoteControlWithUndo.onButtonWasPressed(4);
        remoteControlWithUndo.undoButtonPressed();
        remoteControlWithUndo.onButtonWasPressed(5);
//        remoteControlWithUndo.onButtonWasPressed(7);

//        test for macro command
        Command[] commands = { livingRoomLightOnCommand, livingRoomLightOffCommand,
                kitchenLightOnCommand, ceilingFanHighCommand, ceilingFanMediumCommand };
        MacroCommand macroCommand = new MacroCommand(commands);
        remoteControlWithUndo.setCommand(6, macroCommand, macroCommand);
        System.out.println("--- MacroCommand Test ---");
        remoteControlWithUndo.onButtonWasPressed(6);
        remoteControlWithUndo.offButtonWasPressed(6);
        remoteControlWithUndo.undoButtonPressed();
    }
}
