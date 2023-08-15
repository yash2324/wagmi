package com.yash;

public class linearsearchrec {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        int target=18;
        System.out.println(search(arr,target,0));
    }
    static int search(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,target,index+1);
    }


}
