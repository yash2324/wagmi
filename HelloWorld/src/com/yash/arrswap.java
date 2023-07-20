package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class arrswap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Enter the indices of the nos to be swapped :");
        Scanner in = new Scanner(System.in);
        int in1= in.nextInt();
        int in2= in.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr,in1,in2);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int in1,int in2){
        int temp = arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    }
}
