package main.java.com.ptdika.method;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 20:47
@Last Modified 03/09/2024 20:47
Version 1.0
*/
public class SampleMethod {
    public static void main(String[] args) {

    }

    //gunakan camelCase
    public static void lanjutanProses(){
        int intX = 1;
        switch(intX){
            case 1:
                System.out.printf("ini");break;
            case 2:
                System.out.printf("itu");break;
            default:
                System.out.printf("ini itu");break;
        }
    }

    public static void lanjutanProse1(int panjang, String lebar){
        int intX = 1;
        switch(intX){
            case 1:
                System.out.printf("ini");break;
            case 2:
                System.out.printf("itu");break;
            default:
                System.out.printf("ini itu");break;
        }
    }

    public static void lanjutanProse1(String lebar,int panjang){
        int intX = 1;
        switch(intX){
            case 1:
                System.out.printf("ini");break;
            case 2:
                System.out.printf("itu");break;
            default:
                System.out.printf("ini itu");break;
        }
    }

//    public static void lanjutanProse1(Object){
//        int intX = 1;
//        switch(intX){
//            case 1:
//                System.out.printf("ini");break;
//            case 2:
//                System.out.printf("itu");break;
//            default:
//                System.out.printf("ini itu");break;
//        }
//    }
}
