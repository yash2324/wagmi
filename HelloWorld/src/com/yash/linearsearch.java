package com.yash;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8};
        int tar = 9;
        int x=linearsea(arr1,tar);
        System.out.println("Element found at "+x);

    }
    static int linearsea(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
