package com.company;


/**
 * Created by dmitry on 31/07/15.
 */

class Arithmetic {
    private String name = "Arithmetic";

    public static String getName() {
        return "Arithmetic";
    }
}

class Adder extends Arithmetic {

    String add(int a, int b) {
        return Integer.toString(a + b);
    }

}

class Solution {

    public static void main(String[] argh) {
        Adder X = new Adder();
//        System.out.println("My superclass is: " + X.getClass().getSuperclass().getName());
//        System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " " + X.add(10, 10) + "\n");


        Adder n = new Adder();

//        System.out.println(X.getClass());

//        System.out.println(X.getClass().getSuperclass());

        System.out.println(X.getClass().getSuperclass().getName());


    }

    //    My superclass is: Arithmetic
//    42 13 20

}
