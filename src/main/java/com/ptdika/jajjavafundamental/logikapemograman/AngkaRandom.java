package main.java.com.ptdika.jajjavafundamental.logikapemograman;


import java.util.Random;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 04/09/2024 20:24
@Last Modified 04/09/2024 20:24
Version 1.0
*/
public class AngkaRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        char chVokal [] = {'a','i','u','e','o'};
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rand.nextLong(100000000000L,999999999999L));
//        }
        int strKonsonanLen = strKonsonan.length();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(strKonsonan.charAt(rand.nextInt(strKonsonanLen)));
            }
            System.out.println();
        }
    }
}
