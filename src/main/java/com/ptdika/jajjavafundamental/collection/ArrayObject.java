package main.java.com.ptdika.jajjavafundamental.collection;


import main.java.com.ptdika.jajjavafundamental.model.BuatPassing;
import main.java.com.ptdika.jajjavafundamental.model.Divisi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 05/09/2024 21:53
@Last Modified 05/09/2024 21:53
Version 1.0
*/
public class ArrayObject {
    public static void main(String[] args) {
//        int intArr[] = new int[5];
//        intArr[0] = 1;
//        intArr[1] = 2;
//        System.out.println(intArr);
//        System.out.println(intArr[0]);
//        System.out.println(intArr[1]);
//        System.out.println(intArr[2]);

        ObjectX[] objArr = new ObjectX[2];

        ObjectX obj1 = new ObjectX();// membuat referensi  404b9385
        obj1.setId(1L);
        obj1.setName("Satu");
        obj1.setDescription("Buat 1");
        objArr[0] = obj1;

        obj1 = new ObjectX();// membuat referensi  404b9385
        obj1.setId(2L);
        obj1.setName("Dua");
        obj1.setDescription("Buat 2");
        objArr[1] = obj1;
        System.out.println(objArr);
        System.out.println(objArr[0].getId());
        System.out.println(objArr[1]);

        for (ObjectX obj : objArr) {
            System.out.println(obj.getId());
            System.out.println(obj.getName());
            System.out.println(obj.getDescription());
        }
        System.out.println("===========================================");
        int intSize = objArr.length;
        for (int i = 0; i < intSize; i++) {
            System.out.println(objArr[i].getId());
            System.out.println(objArr[i].getName());
            System.out.println(objArr[i].getDescription());
        }

        // Dynamic Binding
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        Map m = new LinkedHashMap();
        ArrayList<Divisi> al = new ArrayList();

        char chArr [] = new char[5];
        al.add(new Divisi());
        al.add(new Divisi());
        al.add(new Divisi());
        System.out.println(al.get(0).getLt());
        List<BuatPassing> ltBuatPassing = al.get(0).getLt();
        int intX = ltBuatPassing.size();
        System.out.println(ltBuatPassing.get(0).getId());

        for (int i = 0; i < intX; i++) {
            System.out.println(ltBuatPassing.get(i).getId());
        }
//        List l2 = new LinkedList();
//        l.add(obj1);
//        l.add(obj1);
//        l.add(obj1);
//
//        l.clear();
//
//        l.add(obj1);
//        l.add(obj1);
//        l.add(obj1);
//
//        Contoh contoh = new Contoh();//
//        IContoh iContoh = new Contoh();//

    }
}
