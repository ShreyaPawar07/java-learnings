import java.util.Scanner;

public class Armstrong_nim {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt() ;
        int num2 = sc.nextInt();
        
        for(int i=num1;i<=num2;i++){
         int rem,sum=0;
         int check = i;
         while(check!=0){
            rem=check % 10;
            sum=sum+(rem*rem*rem);
            check = check/10;  
         
         if(i == sum){
            System.out.println("number " + i + " is armstrong number");
         }
           
         
        }
    }
}
    
}
