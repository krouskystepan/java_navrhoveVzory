package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        MobileFactory factory = new MobileFactory();
        OS phone = factory.getPhone("Samsung");
        phone.type();

        PCBuilder builer = new PCBuilder();
        PC pc = builer
                .setColor("pink")
                .setGbRAM(16)
                .setCPU("Ryzen").
                setGPU("1060").
                setCPUCores(8).
                getPC();
        System.out.println(pc);
    }
}