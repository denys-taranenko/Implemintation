package task_5;

public interface MyHashMapInterface<K, V> {
    void put(K key, V value);
    void remove(K key);
    void clear();
    int size();
    Object get(K key);
}
