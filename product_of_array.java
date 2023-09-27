import java.util.Arrays;
import java.util.Scanner;

public class product_of_array {
    
    public int[] poat(int[] nums){
        int l = nums.length;
        int[] ans = new int[l];
        Arrays.fill(ans, 1);
        System.out.println("Array while declaring :"+ Arrays.toString(ans));
        int curr = 1;
        for (int index = 0; index < l; index++) {
            ans[index]*=curr;
            curr*=nums[index];
        }
        System.out.println("Array after prefix:"+ Arrays.toString(ans));
        curr =1;
        for (int index = l-1; index >= 0; index--) {
            ans[index]*=curr;
            curr*=nums[index];
            
        }
        System.out.println("Array after suffix :" + Arrays.toString(ans));
      return ans;
    }

    public static void main(String args[]){
          System.out.print("enter length of array");
          Scanner sc = new Scanner(System.in);
          int n  = sc.nextInt();
          int[]arr = new int[n];
          for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
          System.out.println("array after intialization:" +Arrays.toString(arr));
          product_of_array p1 = new product_of_array();
          int[] num1 = p1.poat(arr);
          System.out.println("Array returning"+ Arrays.toString(num1));

    }
}
