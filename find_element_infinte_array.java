import java.util.Arrays;
import java.util.Scanner;

public class find_element_infinte_array {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
          int nums[] = {1,4,5,8,7,13,16,19,21,25,27,29,31,36,38,39,40,41,42,43,49,51,55,59,61};
        
         System.out.println(Arrays.toString(nums));
          int target = in.nextInt();
          
        System.out.println(answer(nums,target));
    }
    static int answer(int[] nums,int target){
        int start = 0;
        int end= 1;
        while(target>nums[end]){
            int newstart = end+1;
            end = end + (end-start+1)*2;
            start = newstart;

        }
        return  binarysearch(nums,target,start,end);
    }
    // writing binnary search algorithm
    static int binarysearch(int [] nums,int target,int start,int end)
    {   
        while(start<=end)
        {
            int mid= start +(end-start)/2;
        if(target<nums[mid]){
            end=mid-1;
        }else if(target>nums[mid]){
            start = mid+1;
        }else{
            return mid ;}
            
          }
        return -1 ;
    }
}
