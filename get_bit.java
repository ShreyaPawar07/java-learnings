public class get_bit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;
        System.out.println("Get bit");
        if((n & bitmask) == 0){
            System.out.println("the bit is zero");
        }else{
            System.out.println("bit is 1");
        }
        System.out.println("Set bit");
        int pos2 = 2;
        int bitmask1 = 1 << pos2;
       
        if((n | bitmask1) == 0){
            System.out.println("the bit is zero");
        }else{
            System.out.println("bit is 1");
        }
    }
}
