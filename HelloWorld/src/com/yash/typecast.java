package com.yash;

import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
     int num = (int)65.67f;

     //automatic type promotions in expressions

//     int a=257;
//     byte b= (byte)(a);
//        System.out.println(b);
//

        byte a= 40;
        byte b=50;
        byte c=100;
        int d= (a*b)/c;
        System.out.println(d);

    }
}
