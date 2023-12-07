public class fibonacci_recursion {
    public static void main(String args[]){
        // System.out.println(fibo(4));
        int m = totalMoney(10);
        System.out.println(m);

    }

    // static int fibo(int n){
    //     System.out.println(n);
    //     if(n<2){
    //         return n;
    //     }
    //     return fibo(n-1)+fibo(n-2);
    // }
    public static  int totalMoney(int n) {
        int money = 1;
        int sum =0 ;
        for (int i =0 ;i< n;i++){
            // System.out.println(Math.floorDiv(7,7));
            if(i %7 == 0){  
                // System.out.println(i);   // System.out.println("i="+i);
                money = money + Math.floorDiv(i,7);
                i=0;
            //   System.out.println("money"+money);
            }
            // System.out.println(i+"i");
            sum = sum + money + i;
          
              
        }
     return sum;
    }
}
