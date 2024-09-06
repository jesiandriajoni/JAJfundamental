package main.java.com.ptdika.jajjavafundamental.logikapemograman;


import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 04/09/2024 19:21
@Last Modified 04/09/2024 19:21
Version 1.0
*/
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah kata: ");
        String strInput = sc.nextLine();
        //kodok -->str1
        //kodok -->str2
        //str1 equals str2

        String strDariKanan = "";
        char[] chArr = strInput.toCharArray();
        int intArr = chArr.length;
        for(int i = 0; i < intArr; i++){
            strDariKanan = strDariKanan + chArr[intArr-i];
        }
        System.out.println("Nilai STR Dari Kanan adalah: "+ strDariKanan);

        if(strDariKanan.equalsIgnoreCase(strInput)){
            System.out.println("ini palindrom");
        }else{
            System.out.println("bukan palindrom");

        }
    }
}
