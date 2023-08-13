package com.yash;

public class sumofdigits {
    public static void main(String[] args) {
        int ans=sum(1342);
        int ans2=product(505);
        System.out.println(ans2);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
    static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10*product(n/10);
    }
}
