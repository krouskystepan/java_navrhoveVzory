package com.company;

public class PC {
    private String color;
    private int GbRAM;
    private String CPU;
    private String GPU;
    private int CPUCores;

    public PC(String color, int gbRAM, String CPU, String GPU, int CPUCores) {
        this.color = color;
        GbRAM = gbRAM;
        this.CPU = CPU;
        this.GPU = GPU;
        CPUCores = CPUCores;
    }

    @Override
    public String toString() {
        return "PC{" +
                "color='" + color + '\'' +
                ", GbRAM=" + GbRAM +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", CPUCores='" + CPUCores + '\'' +
                '}';
    }
}
