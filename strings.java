import java.util.Scanner;


public class strings{
    public static  void main(String[] args) {
        // Learning to use equals() function in strings comparison
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.next();
        if(name.equals("shreya")){
            System.out.println("match");
        }else{
            System.out.println("Not matched");
        }

    }
}