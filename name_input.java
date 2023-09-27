import java.util.Scanner;

public class name_input {
    public static void nametell(String n){
        System.out.println("your name is "+ n );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name :");
        String shre = sc.next() ;
        nametell(shre);

    }
}
