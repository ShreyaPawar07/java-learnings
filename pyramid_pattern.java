public class pyramid_pattern {
      
    public static void printstars(int n){
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j<=n ; j++) 
            {
                System.out.print(j +" ");
            }

            // for (int j = 1; j < i; j++) 
            // {
                
            //     System.out.print(" ");
            // }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 5;
        printstars(n);
    }
}