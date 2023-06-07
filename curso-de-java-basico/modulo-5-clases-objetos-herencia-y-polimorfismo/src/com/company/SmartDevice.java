package com.company;

public class SmartDevice {
    String os;
    String marca;
    String modelo;

    public SmartDevice(){}

    public SmartDevice(String os, String marca, String modelo) {
        this.os = os;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "os='" + os + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
