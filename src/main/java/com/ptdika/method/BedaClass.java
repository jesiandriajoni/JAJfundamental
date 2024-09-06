package main.java.com.ptdika.method;


import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 03/09/2024 21:31
@Last Modified 03/09/2024 21:31
Version 1.0
*/
public class BedaClass {
    @Override
    public String toString(){
        return "INI CLASS BEDA iStatic nilainya"+iStatic;
    }

    public static void main(String[] args) {
        String strX = "etgfuer";
        int intX = strX.length();
        System.out.println(strX.substring(2, intX-1));
    }

    public void getAttribut(Map<String,Object> map,
                            String str1,
                            String str2,
                            String str3,
                            int int1){

    }

    public void getAttribut()
    {

    }

    public static int iStatic;

    public BedaClass(int iStatic){
        this.iStatic = iStatic;
    }

    public static int getiStatic(){
        return iStatic;
    }

}
