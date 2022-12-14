package task_5;

public class Node<K, V> {

    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "key = " + key + ", value = " + value;
    }
}
