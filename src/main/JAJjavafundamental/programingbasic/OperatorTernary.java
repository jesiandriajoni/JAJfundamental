package main.JAJjavafundamental.programingbasic;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 30/08/2024 20:07
@Last Modified 30/08/2024 20:07
Version 1.0
*/
public class OperatorTernary {
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toBinaryString(108));

        int intArgs = Integer.parseInt(args[0]);
        if(intArgs>0)
        {
            System.out.println("Lebih dari 0");
        }else{
            System.out.println("kurang dari 10");

        }


    }
}
