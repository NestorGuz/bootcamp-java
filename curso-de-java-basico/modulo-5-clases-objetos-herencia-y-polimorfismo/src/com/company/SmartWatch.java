package com.company;

public class SmartWatch extends SmartDevice{
    String tipoCorrea;
    String forma;

    public SmartWatch(){}

    public SmartWatch(String os, String marca, String modelo, String tipoCorrea, String forma) {
        super(os, marca, modelo);
        this.tipoCorrea = tipoCorrea;
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoCorrea='" + tipoCorrea + '\'' +
                ", forma='" + forma + '\'' +
                ", os='" + os + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
