package com.yash;

import java.util.Arrays;
import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[5][3];
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++)
            {
                arr2d[i][j]=in.nextInt();

            }

        }
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++)
            {
                System.out.print(arr2d[i][j] + " ");

            }
            System.out.println(" ");

        }
        for(int i=0;i<arr2d.length;i++)
        {
            System.out.println(Arrays.toString(arr2d[i]));
        }
    }
}
