package com.yash;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,4,8,7};
        System.out.println("before :");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("after:");
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }

        }

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
