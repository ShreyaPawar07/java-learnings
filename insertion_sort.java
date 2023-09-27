import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

       for (int i = 0; i < arr.length; i++) {
        int curr = arr[i];
        int j= i-1;
         while (j>=0 && curr< arr[j]) {
            arr[j+1]=arr[j];
            j--;
         }
         arr[j+1]=curr;
       }

       System.out.println("sorted array is:");
       for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");


    }
}
}
