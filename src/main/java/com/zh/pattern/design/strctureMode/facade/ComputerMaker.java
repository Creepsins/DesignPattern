package com.zh.pattern.design.strctureMode.facade;

public class ComputerMaker {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public ComputerMaker(Cpu cpu, Memory memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void computerStart(){
        cpu.cpuStart();
        memory.memoryStart();
        disk.disktart();
    }

    public void computerStop(){
        cpu.cpuStop();
        memory.memoryStop();
        disk.diskStop();
    }
}
