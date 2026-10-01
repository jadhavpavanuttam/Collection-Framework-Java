package com.collection;

import java.lang.reflect.InaccessibleObjectException;
import java.util.*;

public class ListImplementation {
    public static void main(String[] args)throws InaccessibleObjectException,Exception {
//        int []arr=new int[3];
       List<Integer>list=new ArrayList<>(20);//internally size 20 but actual size before inserting elements is : zero
//        list.get(0);
        System.out.println("Before Inserting Element Size is :"+list.size());
//        System.out.println(list.get(0)); //throw IndexOutOfBoundException       list.add(12);
       list.add(3);
       list.add(5);
       list.add(5);
       list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        System.out.println(list);
     list.remove(   Integer.valueOf(4));
        System.out.println( "Remove Indexing Elements : "+list.remove(4));
//        System.out.println(list.remove(" Removing Objects : "+Integer.valueOf(4)));
//        list.add(7);
//        list.add(7);
//        list.add(7);
//        System.out.println(list.size());
////        list.add(7);
//       list.add(4, 23);
//       list.set(4,50);
////        System.out.println("The Value At Index 1 is : "+list.get(1));
//        System.out.println("The Size Of List Is : "+list.size());
////       list.remove(5);
//        for (int i=0;i<list.size();i++)
//            System.out.println("Index : "+i+", Value :"+list.get(i));
//        System.out.println(list);
//        list.remove(4);
//        list.add(5,2);
//        list.addFirst(12);
//        list.addLast(32);
//        list.set(1,1234);
//        System.out.println(list);// toString() Method y default
//
//        Field f1=ArrayList.class.getDeclaredField("elementData");
//        f1.setAccessible(true);
//        Object[] element=(Object[])f1.get(list);
//        System.out.println("ArayList Capecity :"+element.length);
//        System.out.println(list.size());
//        list.add(234);

/*
Internal Working :

Unlike regular Array
default capacity is : 10

 Before adding element :
 Assume Size is :10
 size =size*(3/2)+1
      =(size*1.5)+1
      New Size is :16

  also can set capacity :
  ArrayList <integer>arr=new ArrayList<>(1000);
  arr.size()=100


 */

        System.out.println("Size  :  "+list.size());
        System.out.println(list);















//       list.add(8);
//       Collections.sort(list);
////       list.remove(5);
////       for (int x:list)
////           System.out.print(x+" ");
//    for (int i=0;i<list.size();i++)
//        System.out.print(" "+list.get(i));
//        System.out.println(list.contains(4));
//        System.out.println(list.spliterator().getExactSizeIfKnown());
    }
}
