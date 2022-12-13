package task_1;

import java.util.Arrays;

public class MyArrayList implements MyArrayListInterface {

    private final Object[] elements;
    private int size;
    private int index;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList () {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(Object value) {
        elements[index] = value;
        index++;
        size++;
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
        index = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
