public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shreya") ;
        System.out.println(sb);
        // System.out.println(sb.charAt(4));
        // sb.setCharAt(2, 'm');
        // System.out.println(sb);
        // sb.delete(2, 3);
        // System.out.println(sb);
        // sb.insert(2, 'r');
        // System.out.println(sb);
        
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 -i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
        
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }

        System.out.println(sb);

    }
}
