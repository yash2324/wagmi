package com.yash;

public class bitdigit {
    public static void main(String[] args) {
        int n=17;
        int count=0;
        while(n!=0){
            count++;
            n=n>>1;
        }
        System.out.println(count);
    }
}
