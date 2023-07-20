package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int in1,int in2){
        int temp = arr[in1];
        arr[in1]=arr[in2];
        arr[in2]=temp;
    }

}
