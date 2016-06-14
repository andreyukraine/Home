package com.company;

import java.util.Scanner;

class MyClass2 {

    int passenger;
    int fuelcap;
    int mpg;
}

class MyClass3 {
    int test2(int x) {
        int d = x + 1;
        return d;
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here


        // System.out.println("Hello Andrey");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        int x = Integer.parseInt(name);
        MyClass2 test = new MyClass2();
        int range;

        test.fuelcap = 7;
        test.passenger = 16;
        test.mpg = 21;

        range = test.fuelcap * test.fuelcap;
        System.out.println(range);
        System.out.println(test.mpg);

        MyClass3 test3 = new MyClass3();
        int r = test3.test2(x);
        System.out.println(r);
    }

    // Scanner scanner = new Scanner(System.in);
    //String name = scanner.nextLine();

}

