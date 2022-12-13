package task_3;

public interface MyQueueInterface<T> {

    void add(T value);
    void clear();
    int size();
    T peek();
    T poll();
}
