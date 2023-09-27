import java.util.Scanner;

public class fact_cal {

    public static void printfact(int n) {
        int factorial = 1;
        for (int i = n; i >=1; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial for "+ n + " is " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printfact(n);
    }
}
