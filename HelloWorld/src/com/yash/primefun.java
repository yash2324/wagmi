package com.yash;

import java.util.Scanner;

public class primefun {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int n) {
        if (n<=1)
        {
            return false;

        }
        int c=2;
        while(c*c<n){
            if (n % c == 0) {
            return false;}

             c++;

    }
        if(c*c>n){
            return true;}
        return false;

    }
}
