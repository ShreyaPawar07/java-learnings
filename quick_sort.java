import java.util.Arrays;

public class quick_sort {
    public static void main(String args[]){
         int arr[] = {9,5,2,1,7};
         sorting(arr,0,arr.length-1);
         System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] nums ,int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        while(s<=e){
            // if its sorted it will not swap
            // thus quicksort is preferred over merge sort
            while(nums[s]<nums[m]){
                s++;
            }
            while(nums[e]>nums[m]){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now pivot is at correct index now swapp two halves,recursion call
        sorting(nums,low,e);
        sorting(nums,s,high);
    }
}
