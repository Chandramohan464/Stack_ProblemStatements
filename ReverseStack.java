package Stack_ProblemStatement;

import java.util.Stack;

public class ReverseStack {
    
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();
        s.push(23);
        s.push(21);
        s.push(22);
        s.push(18);
        s.push(45);
        s.push(98);

        System.out.println("Initial stack elements are: ");
        System.out.println(s);

        Stack<Integer> rev=reverseStack(s);
        System.out.println("Reversed stack is: ");
        System.out.println(rev);
    }

    public static Stack<Integer> reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return s;
        }
        int temp=s.pop();
        reverseStack(s);
        insertAtBottom(s,temp);
        return s;
    }

    public static void insertAtBottom(Stack<Integer> s,int temp){
        if(s.isEmpty()){
            s.push(temp);
        }
        else{
            int x=s.pop();
            insertAtBottom(s,temp);
            s.push(x);
        }
    }
}
