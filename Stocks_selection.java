import java.util.Scanner;

public class Stocks_selection {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("please enter values in arr"); 
        for (int r=0; r<arr.length;r++) {
            arr[r] = in.nextInt();
        }
        
        System.out.println("arr entered id :");
        for (int i : arr) {
            System.out.print(arr[i]);
        }
    }

}

