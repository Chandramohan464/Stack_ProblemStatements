package Stack_ProblemStatement;

import java.util.Stack;

public class PostFixEvaluation {
    
    public static void main(String[] args) {

        String expression = "12+3*4-5/2";
        System.out.println("Postfix Evaluation: " + evaluatePostFix(expression));
    }

    public static int evaluatePostFix(String str){

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if(Character.isDigit(ch)){

                stack.push((int)(ch - '0'));
            }
            else{

                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                
                switch(ch){
                    case '+':
                    result = operand1 + operand2;
                    break;
                    case '-':
                    result = operand1 - operand2;
                    break;
                    case '*':
                    result = operand1 * operand2;
                    break;
                    case '/':
                    result = operand1 / operand2;
                    break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
