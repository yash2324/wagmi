package com.yash;

public class strlinear {
    public static void main(String[] args) {
        String name ="Yash";
        char tar = 'Y';
        boolean test =search(name,tar);
        System.out.println(test);
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;

        }
        for (int i=0;i<str.length();i++)
        {
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
