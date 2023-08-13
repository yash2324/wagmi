package practice;

public class binaryq8 {
    public static void main(String[] args) {

    }
    static int pivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        int  mid=s+(e-s)/2;
        while(s<=e){
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>=arr[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }return -1;
    }
}
