package com.yash;

public class sum1ton {
    public static void main(String[] args) {
        int sum=sum(50);
        System.out.println(sum);
    }
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
            }
}
