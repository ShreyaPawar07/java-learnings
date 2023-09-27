import java.util.Scanner;

public class seelction_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        // selelction sort
        for (int i = 0; i < arr.length-1; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
        //    swap 
                  int temp = arr[small];
                   arr[small]=arr[i];
                   arr[i]=temp;
        }
        System.out.println("sorted array is:");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");

    }
   
}
}




