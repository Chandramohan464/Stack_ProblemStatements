package Stack_ProblemStatement;

import java.util.Stack;

public class SortStack {
    
    public static void sortStack(Stack<Integer> s) {
        
        if(!s.isEmpty()){

            int top = s.pop();
            sortStack(s);
            sortedInsert(s, top);
        }
    }

    public static void sortedInsert(Stack<Integer> s, int e) {
        
        if (s.isEmpty() || s.peek() < e) {
            s.push(e);
        } else {
            int top = s.pop();
            sortedInsert(s, e);
            s.push(top);
        }
    }

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
