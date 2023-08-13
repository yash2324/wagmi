package practice;

public class binaryq5 {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,150,170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target) {
        int start=0;
        int end =1;
        while(target>arr[end]) {
            int newStart= end+1;
            end= end+(end-start+1)*2;
            start=newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr, int target,int s,int e) {

        while (s<=e){
            int mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }
}


