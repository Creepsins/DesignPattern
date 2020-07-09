package com.zh.pattern.design.behaviourMode.command;

public class StopCommand implements Command {
    private AudioPlayer player;

    public StopCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }
}
