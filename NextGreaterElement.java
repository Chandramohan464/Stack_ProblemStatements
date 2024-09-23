package Stack_ProblemStatement;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    
    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];

            while (!stack.isEmpty() && stack.peek() <= currentElement) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            } else {
                nge[i] = -1;
            }

            stack.push(currentElement);
        }
        
        return nge;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = findNextGreaterElements(arr);
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}

