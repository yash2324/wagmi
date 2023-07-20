package com.yash;

public class evendigits {
    public static void main(String[] args) {
    int[] nums ={1,2,23,3456,32,9,8,67};
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int digit =0;
            while (x>0){
                digit++;
                x=x/10;
            }
            if(digit/2==0){
                count++;
            }
        }
        return count;
    }
}
