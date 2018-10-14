package com.mattar.areen.dbase2;

public class Data1 {
    private  int num;
    private String name;
    private  String city;

    public Data1(int num, String name, String city) {
        this.num = num;
        this.name = name;
        this.city = city;
    }

    public Data1() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Data1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

