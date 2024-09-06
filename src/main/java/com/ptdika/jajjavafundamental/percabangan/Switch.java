package main.java.com.ptdika.jajjavafundamental.percabangan;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 02/09/2024 20:58
@Last Modified 02/09/2024 20:58
Version 1.0
*/
public class Switch {
    public static void main(String[] args){
        int intX = 2;

        switch (intX){
            case 3: System.out.println("Masuk kesini dengan intX bernilai 3"); break;
            case 4: System.out.println("Masuk kesini dengan intX bernilai 4"); break;
            case 5: System.out.println("Masuk kesini dengan intX bernilai 5"); break;
            case 6: System.out.println("Masuk kesini dengan intX bernilai 6"); break;
            case 7: System.out.println("Masuk kesini dengan intX bernilai 7"); break;
            case 8: System.out.println("Masuk kesini dengan intX bernilai 8"); break;
        }

        if(intX == 7){
            System.out.println("Masuk kesini dengan intX 7");
        }else{
            System.out.println("Masuk kesini dengan intX" + intX);
        }
        String strMessage = intX == 7 ? "Masuk kesini dengan intX 7" : "Masuk kesini dengan intX" + intX;
        System.out.println(strMessage);
    }
}
