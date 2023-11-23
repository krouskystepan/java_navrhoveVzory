package com.company;

public class PCBuilder {
    private String color;
    private int GbRAM;
    private String CPU;
    private String GPU;
    private int CPUCores;

    public PCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PCBuilder setGbRAM(int gbRAM) {
        GbRAM = gbRAM;
        return this;
    }

    public PCBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public PCBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public PCBuilder setCPUCores(int CPUCores) {
        CPUCores = CPUCores;
        return this;
    }

    public PC getPC(){
        return new PC(color, GbRAM, CPU, GPU, CPUCores);
    }
}
