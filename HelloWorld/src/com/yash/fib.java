package com.yash;
import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=0;
        int q=1;
        for(int x=1;x<n;x++){
            int temp =q;
            q=p+q;
            p=temp;

        }
        System.out.println(q);
    }
}
