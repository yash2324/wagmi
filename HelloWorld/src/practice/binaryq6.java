package practice;

public class binaryq6 {
    public static void main(String[] args) {
        int[] arr={0,2,4,6,7,10,9,8,5,2};

    }
    static int search(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid+1]<nums[mid] && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid+1]>nums[mid] || nums[mid-1]<nums[mid]){
                s=mid+1;
            }
            else if(nums[mid+1]<nums[mid] || nums[mid-1]>nums[mid]) {
                e=mid;
            }


        }
        return -1;

    }
}
