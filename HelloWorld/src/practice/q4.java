package practice;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i=1;
        int a=0;
        int b=1;
        while (i<n){

            int c;
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(a);
    }
}
