package com.yash;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("After Swap :");
        swapper(a,b);
        System.out.println(a+" "+b);

    }

    static void swapper(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
    }


}
