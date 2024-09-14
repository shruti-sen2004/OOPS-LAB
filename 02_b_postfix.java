import java.util.*;

class PostfixEvaluator {
    private Stack stack;

    // Constructor
    public PostfixEvaluator(int size) {
        stack = new Stack(size);
    }

    // Method to evaluate a postfix expression
    public int evaluate(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is an operand (digit), push it onto the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            }
            // If the character is an operator, pop two elements, apply the operator, and push the result back
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;

                switch (ch) {
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
        // The final result will be the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        PostfixEvaluator evaluator = new PostfixEvaluator(10);
        Scanner expressionObj = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String expression = expressionObj.nextLine();
        
        int result = evaluator.evaluate(expression);
        System.out.println("Result of the postfix expression \"" + expression + "\" is: " + result);
    }
}