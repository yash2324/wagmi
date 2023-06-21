package com.yash;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int n=23597;
        int x=0,i;
        while (n>0){
            i=n%10;
            x=x*10+i;
            n=n/10;
        }
        System.out.println(x);
    }

}
