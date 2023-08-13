package com.yash;

public class binaryq1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,8,9,10,12};
        int target=4;
        int x=ceiling(arr,target);
        System.out.println(x);
    }

    static int ceiling(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid= s+(e-s)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            if(target>arr[mid]){
                s=mid+1;

            }
            if(target<arr[mid]){
                e=mid-1;
            }
        }return arr[s];
    }
}
