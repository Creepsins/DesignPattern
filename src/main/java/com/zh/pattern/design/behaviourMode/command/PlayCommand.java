package com.zh.pattern.design.behaviourMode.command;

public class PlayCommand implements Command {
    private AudioPlayer player;

    public PlayCommand(AudioPlayer player) {
        this.player = player;
    }
    
    @Override
    public void execute() {
        player.play();
    }
}
