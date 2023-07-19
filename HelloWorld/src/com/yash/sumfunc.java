package com.yash;

import java.util.Scanner;

public class sumfunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum =sum(a,b);
        System.out.println(sum);

    }
    static int sum(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
}

