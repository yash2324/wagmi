package com.yash;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isamstrong(n));
    }

    static boolean isamstrong(int n) {
        int sum =0;
        int original =n;
        while(n>0)
        {
            int x=n%10;
            int y=x*x*x;
            sum= sum+y;
            n=n/10;
        }
        if (sum==original){
            return true;
        }
        return false;
    }


}

