package main.java.com.ptdika.jajjavafundamental.exception;

import java.io.IOException;
import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 02/09/2024 20:12
@Last Modified 02/09/2024 20:12
Version 1.0
*/
public class KeyWordThrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the keyword");
        String strKeyword = sc.nextLine();
        System.out.println("INPUTAN STRING"+strKeyword);

        double douX = 1.06 + 3.35;
        System.out.println("DOUX NUMBER"+douX);

        String strKey = sc.nextLine();
        System.out.println("INPUTAN STRING"+strKey);
        if(strKey.contains("Saya")){
//            System.out.println("Anda Memasukkan kata-kata terlarang");
            throw new IllegalStateException("Anda memasukkan kata-kata terlarang yaitu : "+strKey);
        }
    }

    public static void getData()throws IOException {
        //logic IO Handling

    }

    public static void catchData(){
        try {
            getData();
        } catch (ArithmeticException e) {
           System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
