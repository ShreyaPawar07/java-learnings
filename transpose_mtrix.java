import java.util.Scanner;

public class transpose_mtrix {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
     int n = sc.nextInt();
     int m = sc.nextInt(); 

     int [][] matrix = new int[n][m];
 
     for (int i= 0; i < n ; i++) {
        for (int j = 0; j< m; j++) {
            matrix[i][j]= sc.nextInt();
        }
     }

     //printing transpose matrix 
      System.out.println("transpose is: ");
     for(int j=0; j<m ;j++) {
        for(int i=0; i<n; i++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
 }
sakshi sardar
bhauka patil
shreya pawar
payal chandile 
    


}
