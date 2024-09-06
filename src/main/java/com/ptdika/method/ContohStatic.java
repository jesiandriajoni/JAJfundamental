package main.java.com.ptdika.method;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 21:26
@Last Modified 03/09/2024 21:26
Version 1.0
*/
public class ContohStatic {
    public static void main(String[] args) {
        BedaClass bedaClass = new BedaClass(2);
        System.out.println(bedaClass.toString());
        bedaClass = new BedaClass(13);
        System.out.println(bedaClass.toString());
    }
}
