public class set_bit {
public static void main(String[] args) {
    int n = 9 ;
    int pos = 2;
    int bitmask = 1 << pos;
    int newnumber = bitmask | n;
    System.out.println(newnumber);
}

}