package main.java.com.ptdika.jajjavafundamental.collection;


import java.util.*;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author jesii 
Java Developer
Created on 05/09/2024 21:58
@Last Modified 05/09/2024 21:58
Version 1.0
*/
public class HashSetExample {
    public static void main(String[] args) {
        List<Object> list = new ArrayList();
        list.add(1);
        list.add("2");
        list.add(2);
        list.add(2);
        list.add(2);
        Set<Object> set = new HashSet();
        set.add(1);
        set.add("String");
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list);
        System.out.println(set);


        List<Map<String,Object>> ltMap = new ArrayList();
        Map<String,Object> m = new HashMap();
        m.put("nama","paul");
        m.put("alamat","bogor");
        m.put("email","paul@gmail.com");
        ltMap.add(m);
        m = new HashMap();
        m.put("nama","aji");
        m.put("alamat","bekasi");
        m.put("email","aji@gmail.com");
        ltMap.add(m);
        for (int i = 0; i < ltMap.size(); i++) {
            for(Map.Entry<String,Object> map : ltMap.get(i).entrySet()){
                System.out.println("Key: "+map.getKey()+" Value: "+map.getValue());
            }
        }
        String strX = "a";
        Object o = strX;

//        if(o instanceof Long){
//            cs.setLong
//        }else if(o instanceof Integer){
//            cs.setInt
//        }else if(o instanceof Double){
//            cs.setDouble
//        }else if(o instanceof String){
//            cs.setString
//        }

//        System.out.println(m.get("nama"));
//        System.out.println(m.get("alamat"));
//        System.out.println(m.get("email"));

    }
}
