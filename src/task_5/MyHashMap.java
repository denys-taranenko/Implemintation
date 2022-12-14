package task_5;
import java.util.Arrays;

public class MyHashMap<K,V> implements MyHashMapInterface<K,V> {

    private Node<K, V>[] buckets;
    private Integer capacity = 5;

    public MyHashMap() {
        buckets = new Node[capacity];
    }

    public MyHashMap(Integer capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
    }

    private Integer hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }


    @Override
    public void put(K key, V value) {
        Integer hash = hash(key);
        Node<K, V> entry = new Node<K, V>(key, value);
        Node<K, V> temp = buckets[hash];

        if (temp == null) {
            buckets[hash] = entry;
        } else {
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value;
                    break;
                }
                if (temp.next != null) {
                    temp = temp.next;
                } else {
                    temp.next = entry;
                }
            }
        }
    }

    @Override
    public void remove(K key) {
        Integer hash = hash(key);
        Node<K, V> temp = buckets[hash];
        Node<K, V> prev = null;

        while(temp != null){
            if(temp.key.equals(key)){
                if(prev != null){
                    prev.next = temp.next;
                }else{
                    prev = temp.next;
                    buckets[hash] = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = null;
        }
        capacity = 0;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public Object get(K key) {
        Integer hash = hash(key);
        Node<K, V> temp = buckets[hash];
        while(temp != null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(buckets);
    }
}
