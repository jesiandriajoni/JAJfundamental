package main.java.com.ptdika.jajjavafundamental.looping;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 19:35
@Last Modified 03/09/2024 19:35
Version 1.0
*/
public class LoopFor {
    public static void main(String[] args) {
//        for (int i =1; i <=10; i++){
//            System.out.println("Nilai i adalah : "+i);
//            for (int j = 0;
//                 j < 5;
//                 j++) {
//            }
//        }

       // boolean isFound = false;
//        for(int j=0;j<5;j++){
//            if(j==2){
//                isFound = true;
//                break;
//            }
//            System.out.println("Nilai i adalah : "+j);
//        }
//        if(isFound){
//            System.out.println("SUDAH KETEMU");
//        }else {
//            System.out.println("BELUM DITEMUKAN");
//        }

        for(int i=0; i<=5; i++){
            if(i==2){
                continue;
            }
            for(int j=0; j<=3; j++){
                System.out.printf("Nilai i: " +i+ " J Ter eksekusi" + j);
            }
        }

        int intX = 1;
        switch(intX){
            case 1:
                System.out.printf("Lakukan ini"); break;
            case 2:
                System.out.printf("Lakukan itu"); break;
            case 3:
                System.out.printf("Lakukan ini itu"); break;
        }

        String strHuruf = "J";
        strHuruf = strHuruf.toLowerCase();
        if(strHuruf.equals("a")||strHuruf.equals("i") || strHuruf.equals("o")){
            System.out.printf("Huruf ini adalah vokal");

        }else{
            System.out.printf("Huruf ini adalah konsonan");
        }
    }

    //gunakan camelCase
    public static void lanjutanProse(int panjang, String lebar){
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
}
