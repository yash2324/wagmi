package com.yash;

public class searchinrangelinear {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int tar = 15;
        int start=5;
        int end=10;
        int x=linearsea(arr1,tar,start,end);
        System.out.println("Element found at "+x);

    }
    static int linearsea(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++) {
            if (arr[i] == target) {
                return i;
            }

        }return -1;
    }
}
