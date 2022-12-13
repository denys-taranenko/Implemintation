package task_2;

public class Node {

    Object value;
    Node next;
    Node prev;

    public Node (Object value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
