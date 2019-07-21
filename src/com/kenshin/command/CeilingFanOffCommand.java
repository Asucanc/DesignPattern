package com.kenshin.command;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case CeilingFan.HIGH:
                this.ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                this.ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                this.ceilingFan.low();
                break;
            case CeilingFan.OFF:
                this.ceilingFan.off();
                break;
            default:
                break;
        }
    }
}
