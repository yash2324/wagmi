package com.yash;
import java.util.Scanner;
public class sum2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 nos");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is "+sum);
    }
}
