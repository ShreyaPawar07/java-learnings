import java.util.Scanner;
import java.io.*;
import java.util.*;

public class first_and_last_occurence {
    public static  void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("please enter n : "); 
        int n = in.nextInt();
          int nums[] = new int[n];
          System.out.println("please enter array:");
          for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
          }
            System.out.println(Arrays.toString(nums));
        
          int[] ans = answer(nums,7);
          System.out.println(Arrays.toString(ans));

          
    }

    public static int[] answer(int[] nums,int target){
        // returning array if not found the elements
        int [] ans = new int[2];
        ans[0]  = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;

    }
    static int search(int[] nums,int target,boolean firstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        int mid= start +(end-start)/2;
        while(start<=end){
        if(target<mid){
            end=mid-1;
        }else if(target>mid){
            start = mid+1;
        }else{
            ans=mid;
            if(firstindex){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }
        return ans ;
    }

}
