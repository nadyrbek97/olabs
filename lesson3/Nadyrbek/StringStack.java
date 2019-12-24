public class StringStack{

    private String[] stack;
    private int size;
    private static final int INITIAL_SIZE = 10;

    public StringStack() {
        stack = new String[INITIAL_SIZE];
        size = 1;
    }
    public void push(String value) {
        if (size  == stack.length){
            doubleCapacity();
        }
        stack[size] = value;
        size++;
    }
    public String pop() {
        if (size == 0){
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        String result = stack[size-1];
        stack[size - 1] = "";
        size--;
        return result;
    }
    public String peek() {
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        String result = stack[size-1];
        return result;
    }

    public void empty(){
        if (stack.length == 0);
    }

    private void doubleCapacity(){
        int newCapacity = 2 * stack.length;
        String[] newStack = new String[newCapacity];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}
