
import java.util.Scanner;

public class right_rect {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("enter value of rows and columns:");
        int n =  inp.nextInt();
        int m = inp.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i>j){
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
 
