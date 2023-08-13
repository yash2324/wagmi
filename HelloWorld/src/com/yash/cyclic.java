package com.yash;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        System.out.println("before :");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("after:");
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
