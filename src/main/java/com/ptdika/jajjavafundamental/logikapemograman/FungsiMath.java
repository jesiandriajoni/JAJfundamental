package main.java.com.ptdika.jajjavafundamental.logikapemograman;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 04/09/2024 20:20
@Last Modified 04/09/2024 20:20
Version 1.0
*/
public class FungsiMath {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(12.0));
        System.out.println(Math.sqrt(4.0));
        System.out.println(Math.pow(3.0,2.0));
        System.out.println(Math.pow(2.0,4.0));

        System.out.println(Math.round(3.39));
        System.out.println(Math.round(3.5));

        System.out.println(Math.floor(3.99999));
        System.out.println(Math.floor(3.5));

        System.out.println(Math.ceil(3.0000));

//        3,14,2,5,10,8 -> asc
//        asc desc
//           2 , 3 ,5, 8 ,10 , 14
//           k , l , b, v ,e , r ,J ,h , M
//                   65 -
//                   97 -
//            J, M , b , e , h
        String strNamaFirst = "Dono";
        String strNamaSecond  = "Doyok";
        System.out.println((int)'n');
        System.out.println((int)'y');
        System.out.println(strNamaSecond.compareTo(strNamaFirst));



    }
}
