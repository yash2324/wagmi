package com.yash;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2= {11,12,13,14,15};
        System.out.println(arr2[0]);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter input number :");
            arr[i]=in.nextInt();

        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
