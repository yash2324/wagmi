package com.yash;

public class minnumlinear {
    public static void main(String[] args) {
        int[] arr1 ={4,2,3,4,5,6,7,8};
        int x=linearsea(arr1);
        System.out.println("Minimum number is "+x);

    }
    static int linearsea(int[] arr){
        int target=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]<target){
                target = arr[i];
            }

        }
        return target;
    }
}

