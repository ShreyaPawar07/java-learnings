import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

          for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                // here we considered j's length to arry length -i-1 bcoz we don't ant to traverse 
                // already sorted elemets in array 
                if(arr[j]>arr[j+1]){
                    // /swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
          }
          System.out.println("sorted array is:");
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
