import java.lang.reflect.Array;
import java.util.Arrays;

public class array2d {
    public static void main(String[] args){
        
        int [][] arr1 = {
            {1,2,4},
            {5,7,9},
            {10,55,11}
        };
        for(int[] row: arr1){
            System.out.println(Arrays.toString(row));
        }

    }
}
