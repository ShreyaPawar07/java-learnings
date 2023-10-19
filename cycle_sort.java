import java.util.Arrays;

public class cycle_sort {
    public static void main(String args[]){
        int arr[] = {5,1,4,2,3};
        System.out.println("array at start :"+ Arrays.toString(arr));
        sort(arr);
        System.out.println("array after sorting :"+ Arrays.toString(arr));
    }
    static void sort(int arr[]){
        int i = 0;
        while(i<arr.length -1){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

    }
    static void swap(int arr[],int first,int second){
        int temp= arr[first];
        arr[first]  = arr[second];
        arr[second]=temp;
    }
}
