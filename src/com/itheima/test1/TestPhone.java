package com.itheima.test1;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        ph1.setBrand("huawei");
        ph1.setPrice(5555);
        System.out.println(ph1.getBrand() + ph1.getPrice());
        ph1.call("EG");
        ph1.text("WEG");
        Phone ph2 = new Phone("Iphone",7000);
        System.out.println(ph2.getBrand()+ph2.getPrice());
        System.out.println("test 1");
        System.out.println("test 2");



    }
}
