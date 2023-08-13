package com.yash;

public class palin {

    public static void main(String[] args) {
        String str ="abcbd a";
        System.out.println(Solution(str));

    }
    static boolean Solution(String str) {
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            int start=i;
            int end=str.length()-1-i;

            if(str.charAt(start)!=str.charAt(end)){
                return false;


            }


        }
        return true; // All characters matched, it's a palindrome
    }
}

