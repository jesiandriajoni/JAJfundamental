package main.java.com.ptdika.jajjavafundamental.warpperclass;


import main.java.com.ptdika.jajjavafundamental.model.BuatPassing;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 05/09/2024 19:10
@Last Modified 05/09/2024 19:10
Version 1.0
*/
public class ContohGenericClass {
    public static void main(String[] args) {
//        List<Double> list = new ArrayList<Double>();
//
//        String strNomor = "5";
//        int intNomor = Integer.parseInt(strNomor);
//        System.out.println();//10010

//        int intX = 2;//2
//        int intY = intX;//2
//        System.out.println(intX);
//        System.out.println(intY);
//        intY = 4;
//        System.out.println(intX);
//        System.out.println(intY);


//        BuatPassing buatPassing = new BuatPassing();// rak -> a1b0df
//        BuatPassing buatPassing1 = buatPassing;//a1b0df
//        System.out.println(buatPassing);
//        System.out.println(buatPassing1);
//
//        buatPassing.setId(5);
//        System.out.println(buatPassing1.getId());
//
//        buatPassing1.setId(7);
//        System.out.println(buatPassing.getId());
//
//        Integer integerX = 10;
//        int integerY = integerX;
//        System.out.println(integerX);
//        System.out.println(integerY);
//
//        integerY = 12;
//        System.out.println(integerX);
//        System.out.println(integerY);

//        int intX = 8;
//        intX = injectValuePrimitive(intX);
//        System.out.println(intX);
//        BuatPassing buatPassing = new BuatPassing();
//        buatPassing.setId(5);
//        injectValueObject(buatPassing);
//        System.out.println(buatPassing.getId());
//        System.out.println(Double.parseDouble("1200.5"));//47 - 58
//        System.out.println();//47 - 58
//        System.out.println();//47 - 58
//        System.out.println(Integer.toString(15)+(7*3*0.5));
//        System.out.println(1010101010);
//        int intLength = String.valueOf(1010101010).length();
//        System.out.println(intLength);

        Character c = '1';
        System.out.println(Character.isDigit(c));//
        int intChar = c;
        if(intChar >= 47 && intChar <= 58) {

        }

    }

    public static Integer injectValuePrimitive(int intH){
        intH = 12;

        return intH;
    }

    public static void injectValueObject(BuatPassing buatPassingX){
        System.out.println(buatPassingX);
        System.out.println(buatPassingX.getId());
        buatPassingX.setId(15);
    }
}
