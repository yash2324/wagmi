package practice;

public class binaryq7 {
    public static void main(String[] args) {

    }
    int ans(int[] arr,int target){
        int peak = Peak(arr);
        if(target<=peak){
            return search(arr,target,0,peak);
        }
        else{
            return search(arr,target,peak+1,arr.length-1);
        }
    }
    int search(int[] arr,int target,int s,int e){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    int search2(int[] arr,int target,int s,int e){

        while(s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                s=mid+1;
            }
            else if(target>arr[mid]){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int Peak(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while (s<e){
            int mid=s+(e-s)/2;

            if(nums[mid+1]<nums[mid]){
                e=mid;

            }
            else {
                s=mid+1;
            }


        }
        return s;
    }
}
