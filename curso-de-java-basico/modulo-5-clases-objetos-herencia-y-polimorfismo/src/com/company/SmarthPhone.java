package com.company;

public class SmarthPhone extends SmartDevice{
    int numeroCamaras;
    String proveedorDeServicios;

    public SmarthPhone(){}

    public SmarthPhone(String os, String marca, String modelo, int numeroCamaras, String proveedorDeServicios) {
        super(os, marca, modelo);
        this.numeroCamaras = numeroCamaras;
        this.proveedorDeServicios = proveedorDeServicios;
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "numeroCamaras=" + numeroCamaras +
                ", proveedorDeServicios='" + proveedorDeServicios + '\'' +
                ", os='" + os + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
