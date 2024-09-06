package main.java.com.ptdika.jajjavafundamental.programingbasic;


import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 30/08/2024 19:10
@Last Modified 30/08/2024 19:10
Version 1.0
*/
public class PassingBy {

    public static void main(String[] args) {
        int intX = 0;
        intX = getDataX();
        System.out.println(intX);
        List<Integer> listX = getDataList();
        int intList = listX.size();
        for (int i = 0; i < getDataList().size(); i++) {
        }
//        int intZ = "abc".length();
//        System.out.println("abc".length());
//        for (int i = 0; i < "abc".length(); i++) {
//        }
//        System.out.println(intX);
//        for (int i = 0; i < intX; i++) {
//        }
//        if(intX>10){
//        }
//        String strX = "980198340918382973498";

//        System.out.println("5"+10);
    }

    private static Integer getDataX(){
        return ((10*8)-2)+6;
    }

    private static List getDataList(){
        String strX = "Hello World";

        List list = new ArrayList();
        list.add(strX);
        list.add(strX+" abc");
        list.add(strX+" 3212");

        return list;
    }

}
