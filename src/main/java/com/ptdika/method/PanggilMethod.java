package main.java.com.ptdika.method;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 20:48
@Last Modified 03/09/2024 20:48
Version 1.0
*/
public class PanggilMethod {
    public static void main(String[] args) {

    }

    // memisah method di panggil pada method lain
    public void init(){
        System.out.printf("1");
        System.out.printf("2");
        System.out.printf("3");
        System.out.printf("4");
    }

    public void init(String strNull)
    {
        System.out.printf("1");
        System.out.printf("2");
        System.out.printf("3");
        System.out.printf("4");
        System.out.printf("5");
    }

    public void methodBiasa(){
        init(null);
    }

    public void methodLuarBiasa(){
        init();
    }

    public void methodBiasaLuar(){
        init();
    }

}
