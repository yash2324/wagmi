package com.yash;

public class recarr1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,12,17,15};
        System.out.println(arrsorted(arr,0));
    }
    static boolean arrsorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && arrsorted(arr,index+1);
    }
}
