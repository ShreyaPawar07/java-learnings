public class product_of_subarray {
    public static void main(String args[]){
    int[] nums = {-2,3,-4};
    int maxu = 0;
    int maxl = nums[0];
        for(int i =0 ;i<nums.length ; i++){
            maxu = Math.max(maxu*nums[i],nums[i]);
            System.out.println("maxu "+i+ " " +maxu);
            maxl = Math.max(maxl,maxu);
            System.out.println("maxl "+ i +" " +maxl);
        }
    System.out.println(maxl);
    }
}
