import java.util.Arrays;
import java.util.Scanner;

public class finding_peak_in_mountain {
    public static void main(String[] args) {
          int nums[] = {1,4,8,3,2,1};
        
         System.out.println(Arrays.toString(nums));

         int ans = peak_element_mountain_array(nums);
         System.out.println(ans);
    }

    static int peak_element_mountain_array(int[] nums){
        int start =0;
        int end = nums.length-1;
        while(start <end){
            int mid= start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
