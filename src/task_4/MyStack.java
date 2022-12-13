package task_4;

import java.util.Arrays;

public class MyStack implements MyStackInterface {

    private int size;
    private Object[] elements;
    private int top;
    private int index;


    public MyStack (int s) {
        size = s;
        elements = new Object[size];
        top = -1;
    }


    @Override
    public void push(Object value) {
        int i = ++top;
        elements[i] = value;
    }

    @Override
    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, this.index - index);
        size--;
        this.index--;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return elements[top];
        }
    }

    @Override
    public Object pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return elements[top--];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
