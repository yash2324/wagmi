package practice;

import java.util.Arrays;

public class binaryq4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,5,6,7,8,9};
        int target =5;
        int[] x= posi(arr,target);
        System.out.println(Arrays.toString(x));

    }

    static int[] posi(int[] arr, int target) {
        int s=start(arr,target);
        int e=end(arr,target);
        return new int[] {s, e};
    }
    static int start(int[] arr, int target){
        int ans=-1;
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                ans=mid;
                e=mid-1;
            }

        }
        return ans;
    }
    static int end(int[] arr, int target){
        int ans =-1;
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                ans=mid;
                s=mid+1;
            }

        }
        return ans;
    }


}
