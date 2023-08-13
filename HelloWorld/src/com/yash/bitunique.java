package com.yash;

public class bitunique {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,5,2,4,3};
        System.out.println(uni(arr));
    }
    static int uni(int[] arr){
        int unique=0;
        for (int j : arr) {
            unique = unique ^ j;
        }
        return unique;
    }
}
