public class clr_bit {
    public static void main(String[] args) {
        int n =9;
        int posm= 2;
        int bitmask = 1<<posm;
        int newn = ~(bitmask);
        int newnum = newn & n;
        System.out.println(newnum);
    }
}
