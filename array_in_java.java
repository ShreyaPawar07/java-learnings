import java.util.Scanner;

public class array_in_java {

    public static void main(String[] args) {
        int n ,target ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        target = sc.nextInt();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                System.out.println("index:" + index); 
            }
            }
        }
        
    }

