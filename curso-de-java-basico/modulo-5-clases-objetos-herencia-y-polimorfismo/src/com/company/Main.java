package com.company;

public class Main {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch("Wear OS", "Huawei", "GT 3 Pro", "Piel", "Circular");
        SmarthPhone smarthPhone = new SmarthPhone("Android 13", "Samsung", "Galaxy Note 22", 5, "Telcel");

        System.out.println(smartWatch);
        System.out.println(smarthPhone);
    }
}
