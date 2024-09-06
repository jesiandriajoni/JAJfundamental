package main.java.com.ptdika.jajjavafundamental.exception;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 02/09/2024 19:35
@Last Modified 02/09/2024 19:35
Version 1.0
*/
public class ClassifiedException {
    public static void main(String[] args) throws InterruptedException {
        //handle error cari di gpt
        Thread.sleep(10);
        //SQL --> connectivity ke database
        //misal :
        //username : root
        //password : root
        //192.168.86.3309
        //IO --> File
        System.out.println("INI DI EKSEKUSI");
        int intX = 1/10;
        System.out.println("mungkin ini akan error" +intX);

        // mengunakan handling
        try{
            int intY = 1/20;
            int intZ = intY;

            System.out.println(intY/intZ);
        }catch(ArithmeticException e){
            System.out.println("Ketangkep nih error"+e.getMessage());
        }
        System.out.println("Berhenti Disini....");

        try{
            int intA = 1/20;
            int intB = intA;

            System.out.println(intA/intB);
            //close / kill respon connectivity
        }catch(NullPointerException e){
            System.out.println("Ketangkep nih error"+e.getMessage());
        }finally{
            System.out.println("Masuk ke finally");
           //clode conectivity nya disini
        }
        System.out.println("Berhenti Disini....");
    }
}
