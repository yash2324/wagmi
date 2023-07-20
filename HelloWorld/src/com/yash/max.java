package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner in = new Scanner(System.in);
        int maxin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxin])
            {
                maxin=i;
            }
        }
        System.out.println(arr[maxin]);



    }
    static void swap(int[] arr,int in1,int in2){
        int temp = arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    }
    }

