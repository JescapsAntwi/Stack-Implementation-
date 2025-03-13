import java.util.Arrays;

import static jdk.internal.util.ArraysSupport.reverse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //implementing the arraystack class
//        System.out.println("h");
//
//        Stack<Integer> S = new ArrayStack<>();
//        S.push(5);
//        S.push(3);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        System.out.println(S.isEmpty());
//        System.out.println(S.pop());
//        System.out.println(S.isEmpty());
//        System.out.println(S.pop());
//        S.push(7);
//        S.push(9);
//        System.out.println(((ArrayStack<Integer>) S).top());
//        S.push(4);
//        System.out.println(S.size());
//        System.out.println(S.pop());
//        S.push(8);
//        S.push(6);
//        System.out.println(S.pop());

        //Tester routine for reversing arrays
        Integer[] a = {4, 8, 15, 16, 23, 42}; //autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));

    }
}




