package task_3;

import java.util.Arrays;

public class MyQueue<T> implements MyQueueInterface<T> {

    private Object[] elements;
    private int start;
    private int end;

    public MyQueue(int capacity) {
        elements = new Object[capacity];
        start = capacity - 1;
        end = capacity - 1;
    }

    public MyQueue() {
        this(10);
    }


    @Override
    public void add(T value) {
        if (value == null)
            throw new IllegalArgumentException();

        if (end >= 0) {
            elements[end--] = value;
        } else {
            Object[] elementsBefore = elements;
            end = elementsBefore.length - 1;

            elements = new Object[elements.length * 2];
            System.arraycopy(elementsBefore, 0, elements, elementsBefore.length, elementsBefore.length);

            start += elementsBefore.length;
            elements[end--] = value;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        start = elements.length - 1;
        end = elements.length - 1;
    }

    @Override
    public int size() {
        return start - end;
    }

    @Override
    public T peek() {
        if (start == end)
            return null;
        return (T) elements[start];
    }

    @Override
    public T poll() {
        if (start == end)
            return null;
        return (T) elements[start--];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
