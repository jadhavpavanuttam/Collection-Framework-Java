package com.collection;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());
        List<String> strings = Arrays.asList("Monday", "Tuesday", "Tursday");
        System.out.println(strings.getClass().getName());
        List<String> list3 = new ArrayList<>(strings);
        list3.addAll(strings);

//        Set<String> stringSet=new HashSet<>();
//        stringSet.addAll(list3);
//        System.out.println(stringSet);
        for (int i = 0; i < list3.size(); i++) {
            System.out.println("Index :  "+i+" ,  Element : "+list3.get(i));//In Case Of : list.get(3) it will throw exception

        }
//      List<Integer> list1= List.of(1,2,34,234,324);
//        System.out.println(list1.set(1,123)); //Immutable Object comings on : java 9
    }
}

/*
Used For Two Thinks :
1.used whenever we want ordered collection
2.Allowing to duplicate elements

Internal Working :
dynamically size is increased unlike array


 */