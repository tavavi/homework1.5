package com.company;

public class Main {

    public static void main (String[] args ){
        Boss nike = new Boss(9000,700,"the deafens");
        System.out.println(" Boss.health " +  nike.getHealth() + " " + nike.getDamage() + " " + nike.getBossDeafanse ());
    }
}