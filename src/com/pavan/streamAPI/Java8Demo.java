package com.pavan.streamAPI;

import java.util.function.Predicate;

import static javax.management.Query.and;

public class Java8Demo {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("This is me");
        });
        MathOperation mathOperation=(a,b)-> a+b;
        MathOperation mathOperation1=(a,b)-> a-b;
        MathOperation mathOperation2=(a,b)-> a*b;
        MathOperation mathOperation3=(a,b)-> a/b;
int res=mathOperation.operation(5,2);
        System.out.println(res);
        //predicate holds the condition and return boolean valued functio
        //Predicate -->boolean values function
        Predicate<Integer> isEven=x->x%2==0;
        System.out.println("Value Return : "+isEven.test(4));
    Predicate<String> isStartWithA=x->x.toLowerCase().startsWith("A");
        System.out.println("Result is : "+isStartWithA.test("amol"));//false
        Predicate<String> isWordEnding=p->p.toLowerCase().endsWith("n");
        Predicate<String> and=isWordEnding.and(isStartWithA);
        System.out.println("Both Conditions Are True : "+and.test("aman"));
                //true
        System.out.println("Result is :"+isWordEnding.test("pavan"));  //false
    }
}

//class TaskPerform implements Runnable
//{
//    @Override
//    public void run()
//    {
//        int pavan[]={1,2,3,4,5,56,6,7,8};
//        for (int x:pavan)
//            System.out.print(" "+x);
//    }
//}

/*
Lambda Expression : is used to implement functional interface :
Functional Programming : we will be used function as variable
shift+shift+predicate
 */