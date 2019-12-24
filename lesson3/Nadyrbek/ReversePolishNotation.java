public class ReversePolishNotation{

    public ReversePolishNotation() {
        System.out.println("I am Reverse Polish Notation.");
        System.out.println("hello " + reverse("( 1 + 2 ) * 4 + 3"));
    }

    public static int reverse(String expresion) {
        if  (expresion == null)
            return 0;
        char[] in = expresion.toCharArray();
        CharStack stack = new CharStack();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < in.length; i++)
            switch (in[i]) {
                case '+':
                case '-':
                    while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        out.append(' ');
                        out.append(stack.pop());
                    }
                    out.append(' ');
                    stack.push(in[i]);
                    break;
                case '*':
                case '/':
                    out.append(' ');
                    stack.push(in[i]);
                    break;
                case '(':
                    stack.push(in[i]);
                    break;
                case ')':
                    while (!stack.empty() && stack.peek() != '(') {
                        out.append(' ');
                        out.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    out.append(in[i]);
                    break;
            }

        while (!stack.empty())
            out.append(' ').append(stack.pop());
        System.out.println("Postfix expression: " + out.toString());
        // aftering getting postfix expression we need to calculate it
        return evaluatePostfixExpression(out.toString());
    }


    public static int evaluatePostfixExpression(String expression){
        StringStack s = new StringStack();
        int result = 0;
        String operand = "";
        for(int i = 0; i<expression.length();i++){
            if(Character.isDigit(expression.charAt(i)) == true){
                operand = operand + expression.charAt(i);
                if(Character.isDigit(expression.charAt(i+1)) == false){
                    s.push(operand);
                    operand = "";
                }
            }
            if(expression.charAt(i) == '+'){
                int x = Integer.parseInt((String) s.pop()) + Integer.parseInt((String) s.pop());
                result = result + x ;
                s.push(String.valueOf(x));
            }
            if(expression.charAt(i) == '-'){
                int x = Integer.parseInt((String) s.pop()) - Integer.parseInt((String) s.pop());
                result = result + x ;
                s.push(String.valueOf(x));
            }
            if(expression.charAt(i) == '*'){
                int x = Integer.parseInt("" + s.pop()) * Integer.parseInt("" + s.pop());
                System.out.println("x " + x);
                result = result + x ;
                System.out.println("result " + result);
                s.push(String.valueOf(x));
            }
            if(expression.charAt(i) == '/'){
                int x = Integer.parseInt("" + s.pop()) / Integer.parseInt("" + s.pop());
                System.out.println("x " + x);
                result = result + x ;
                System.out.println("result " + result);
                s.push(String.valueOf(x));
            }
        }
        System.out.println("Final result: " + result);
        return result;
    }

}