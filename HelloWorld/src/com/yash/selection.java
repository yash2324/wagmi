package com.yash;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,4,8,7};
        System.out.println("before :");
        System.out.println(Arrays.toString(arr));
        select(arr);
        System.out.println("after:");
        System.out.println(Arrays.toString(arr));

    }

    static void select(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex= getmax(arr,0,last);
            swap(arr,maxIndex,last);

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getmax(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
