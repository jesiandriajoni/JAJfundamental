package main.java.com.ptdika.jajjavafundamental.stringobject;

import java.util.Scanner;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 02/09/2024 19:10
@Last Modified 02/09/2024 19:10
Version 1.0
*/
public class IOSScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Text :");
        String strNama = scanner.nextLine();
        System.out.println("Text yang di masukkan adalah : " + strNama);

        System.out.println("Masukkan Nilai Bilangan Bulat");
        int intNilai = scanner.nextInt();
        System.out.println("Nilai Bilangan Bulat adalah : " + intNilai);

        System.out.println("Masukkan Nilai Bilangan Bulat");
        double douNilai = scanner.nextDouble();
        System.out.println("Nilai Bilangan Bulat adalah : " + douNilai);



    }
}
