package practice;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.println("even");

        }
        else
            System.out.println("odd");
    }
}
