package com.yash;

public class missingnum {
    public static void main(String[] args) {


    }
    static int num(int[] arr)
    {
        sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
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

