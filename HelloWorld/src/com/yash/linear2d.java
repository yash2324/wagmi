package com.yash;

import java.util.Arrays;

public class linear2d {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3,4},{2,4,5,6,7},{3,4,5,9,7,8}};
        int tar = 9;
        int[] x=linearsea(arr1,tar);
        System.out.println("Element found at "+ Arrays.toString(x));
        System.out.println("Maximum value in the array is "+max(arr1));
    }
    static int[] linearsea(int[][] arr, int target){
        if(arr.length==0){
            return null;
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                if (arr[i][j] >max) {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}

