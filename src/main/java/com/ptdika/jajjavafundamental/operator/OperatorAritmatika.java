package main.java.com.ptdika.jajjavafundamental.operator;



/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 30/08/2024 19:16
@Last Modified 30/08/2024 19:16
Version 1.0
*/
public class OperatorAritmatika {
    public static void main(String[] args) {

        int intNum1 = 20;
        int intNum2 = 30;
        int intSum = intNum1 + intNum2;
        System.out.println(intSum);

        double douNUm1 = 20.0;
        int intNum3 = 30;
        double douNUm2 = (intNum3 / douNUm1);
        System.out.println(douNUm2);

        // operator assignment

        //boolean
        int intArgs = Integer.parseInt(args[0]);
        System.out.println(intArgs != 4);

        int x = 3;
        System.out.println(intArgs != 3 && x > 3 || intArgs == 4 && x == 2);

        // gerbang logika
//        && --> AND
        // || ==> OR
//        ! --> NOT

        //AND
        int intNumberm = Integer.parseInt(args[0]);
        System.out.println((3==3));
        System.out.println((4==4));
        System.out.println((3==3) && (4==4));

        //OR
        System.out.println((3!=3));
        System.out.println((4!=4));
        System.out.println((3!=3) || (4!=4));

        //NOT(kebalikan)
        System.out.println((3!=3));
        System.out.println((4!=4));
        System.out.println(!((3!=3) || (4!=4)));

        //NAND
        //NOR

        //XOR
        System.out.println((5==5)^(4!=4)); //true
        System.out.println((5==5)^(4==4)); //false

        //XNOR
        System.out.println(!(5==5)^(4!=4));

        //Bitwise (bilangan binner dalam bentuk bit) dikonversi ke binner
        System.out.println(10&12);





    }
}
