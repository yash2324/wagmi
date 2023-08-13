package com.yash;

public class pattern5 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            int totalcolsinrow = i>5?10-1-i:i;
            for (int j=0;j<totalcolsinrow;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
