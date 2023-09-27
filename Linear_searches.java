public class Linear_searches {

    public static void main(String[] args){
     int[] arr1 = {1,5,66,17,3};
    //  arr1 = {1,5,66,17,3};
     linear_searching(arr1, 5);
    }
    static int linear_searching(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(target == arr[index]){
                return index; 
                // break;   
             }
        }
        return -1;
    }
}

