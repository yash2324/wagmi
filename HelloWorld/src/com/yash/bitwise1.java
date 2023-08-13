package com.yash;

public class bitwise1 {
    public static void main(String[] args) {
        System.out.println(iseven(13));
    }
    static boolean iseven(int n){
        if((n & 1 )== 1){
            return false;
        }
        return true;
    }
}
