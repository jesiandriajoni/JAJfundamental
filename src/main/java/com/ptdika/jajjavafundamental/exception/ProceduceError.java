package main.java.com.ptdika.jajjavafundamental.exception;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 02/09/2024 20:35
@Last Modified 02/09/2024 20:35
Version 1.0
*/
public class ProceduceError {
    public static void main(String[] args)
    {
        String strToArr = "ini saya..";
        char[] chArr = strToArr.toCharArray();
        System.out.println(chArr.length);
        System.out.println(chArr[13]);

        int intTampung = 8;
        for(int i = 0; i < chArr.length; i++) {
            intTampung = chArr[i];
            if(intTampung >= 58 && intTampung <= 65){
                throw new IllegalArgumentException("Karakter tidak diperbolehkan.." + chArr[i]);
            }
        }
        System.out.println("Berhasil dibuat");
    }
}
