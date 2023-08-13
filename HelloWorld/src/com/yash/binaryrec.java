package com.yash;

public class binaryrec {
    public static void main(String[] args) {
        int[] arr={10,11,13,16,19,20,25};
        int target=19;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr,target,s,mid-1);
        }
        else{
            return search(arr,target,mid+1,e);
        }

    }
}
