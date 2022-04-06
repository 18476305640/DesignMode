package com.zjazn.dm._3_23种设计模式._4_建造者模式;

public class main {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonBuilder());
        House house1 = houseDirector.constructHouse();

        System.out.println("-----------------------");
        houseDirector.setHouseBuilder(new HighBuilding());
        House house2 = houseDirector.constructHouse();
    }
}
