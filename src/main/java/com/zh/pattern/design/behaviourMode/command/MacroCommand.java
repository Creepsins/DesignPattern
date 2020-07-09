package com.zh.pattern.design.behaviourMode.command;

public interface  MacroCommand extends Command{
    public void add(Command command);

    public void remove(Command command);
}
