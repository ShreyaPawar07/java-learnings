import java.util.Stack;
import java.io.*;

public class operations {

    static void push_up(Stack <Integer> shreya){
        for (int index = 0; index < 5; index++) {
            shreya.push(index);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> shreya = new Stack<Integer>();

        push_up(shreya);
        System.out.println(shreya);
        shreya.pop();
        System.out.println(shreya);

    }
}
