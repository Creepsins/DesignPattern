package com.zh.pattern.design.behaviourMode.command;

public class RewindCommand implements Command {
    private AudioPlayer player;

    public RewindCommand(AudioPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.rewind();
    }
}
