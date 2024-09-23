package Stack_ProblemStatement;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        if(checkBalancedParanthesis(str)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }

        sc.close();
    }

    public static boolean checkBalancedParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') || (ch == '}' && last != '{') || (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}