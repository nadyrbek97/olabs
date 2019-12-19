
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Notation {

    private List<String> outputSeparated;
    private Stack<String> operations;
    
    public double getResult(String inputValue){
        operations = new Stack<>();
        outputSeparated = new ArrayList<>();
        char[] t = inputValue.toCharArray();
       
        for (int i = 0; i < t.length; i++) {
            if (isOperation(t[i])) {
                addOperations(t[i]);
            }else{
                 outputSeparated.add(String.valueOf(t[i]));
            }
        }

        while(!operations.isEmpty()){
             outputSeparated.add( operations.pop());
        }
       
        System.out.println(outputSeparated);
        
        double anw = calculate();
        System.out.println(anw);
        return anw; 
    }

    private boolean isOperation(char c) {
        switch(c){
            case '-':
                return true;
            case '+':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            case '(':
                return true;
            case ')':
                return true;
            default:
                return false;
        }
    }

    private void addOperations(char c) {
        if (operations.isEmpty()) {
            operations.push(String.valueOf(c));
        }else{
            if (c == '(') {
                operations.push(String.valueOf(c));
            }else if(c == ')'){
                String s = operations.pop();
                while(!s.equals("(")){
                    outputSeparated.add(s);
                    s = operations.pop();
                }
            }
            else if (getPriority(c)<=getPriority(operations.peek().charAt(0))) {
                 while(!operations.isEmpty()){
                      outputSeparated.add( operations.pop());
                  }
                  operations.push(String.valueOf(c));
            }else{
                operations.push(String.valueOf(c));
            }
        }
    }

    private int getPriority(char c) {
         switch(c){
            case '-':
                return 1;
            case '+':   
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private double calculate() {
        Stack<Double> stack = new Stack();
        for (int i = 0; i < outputSeparated.size(); i++) {
            if (!isOperation(outputSeparated.get(i).charAt(0))) {
                stack.push(Double.parseDouble(outputSeparated.get(i)));
            }else{
                double tempSum = doOperation(stack.pop(),stack.pop(),outputSeparated.get(i));
                stack.push(tempSum);
            }
        }
        return stack.pop();
    }

    private double doOperation(Double firstValue, Double secondValue, String operation) {
        switch(operation){
            case "+":
                return secondValue + firstValue;
            case "-":
                return secondValue - firstValue;
            case "*":
                return secondValue * firstValue;
            case "/":
                return secondValue / firstValue;
            default:
                return 0;
        }
    }
}
