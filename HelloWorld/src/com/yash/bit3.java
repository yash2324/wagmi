package com.yash;

public class bit3 {
    public static void main(String[] args) {
        System.out.println(bit(10,2) );
    }
    static int bit(int n,int index){

        return ((n & (1 << (index - 1))) >> (index - 1));
    }
}
