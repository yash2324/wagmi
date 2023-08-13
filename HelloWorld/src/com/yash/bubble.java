package com.yash;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,4,8,7};
        System.out.println("before :");
        System.out.println(Arrays.toString(arr));
        sorting(arr);
        System.out.println("after:");
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        for (int i=0;i<arr.length;i++){
            boolean swap = false;
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }
}
