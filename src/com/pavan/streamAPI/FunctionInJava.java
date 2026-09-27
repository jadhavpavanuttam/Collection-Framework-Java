package com.pavan.streamAPI;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

import static java.util.function.UnaryOperator.identity;

public class FunctionInJava {
    //Function->work of function
    public static void main(String[] args) {
        Function<Integer,Integer>doubleIt=x->2*x;
        Function<Integer,Integer> tripeIt=x->3*x;
        System.out.println(doubleIt.apply(100));//600
        System.out.println(doubleIt.andThen(tripeIt).apply(200));//1200
        System.out.println(doubleIt.compose(tripeIt).apply(20));//120
    Function<Integer,Integer> res=Function.identity();
    Integer x1= res.apply(5);
        System.out.println("Result is : "+x1);
    }
}
