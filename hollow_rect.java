
import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("enter value of rows and columns:");
        int n =  inp.nextInt();
        int m = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(i==1 || i==n || j==1 || j==m){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }
}

    
