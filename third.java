import java.util.Scanner;

public class third {
    public static void main(String[] args){
        int c ,temp;
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter the string:");
        // c = sc.nextInt();
        // System.out.println("your entered string is " + c);

        //swapping two numbers
        System.out.println("enter two numbers:");
        int x= sc.nextInt();
        int y= sc.nextInt();


        temp=x;
        x = y;
        y = temp;

        System.out.println("After Swapping\nx = "+x+"\ny = "+y);
        
    }
}
