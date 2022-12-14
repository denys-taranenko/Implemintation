package task_2;

public class MyLinkedList implements MyLinkedListInterface {

    private Node head;


    @Override
    public void add(Object value) {
        Node temp = new Node(value);

        if (head != null) {
            temp.next = head;
            head.prev = temp;
        }
        head = temp;
    }

    @Override
    public void remove(int index) {
        if (head == null)
            return;
        Node temp = head;
        if (index == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < index - 1;
             i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public int size() {
        int count = 0;
        Node temp3 = head;

        while (temp3 != null){
            count++;
            temp3 = temp3.next;
        }
        return count;
    }

    @Override
    public Object get(int index) {
        Node temp4 = head;

        for (int i = 0; i < index; i++) {
            temp4 = temp4.next;
        }
        return temp4;
    }

    @Override
    public String toString() {
        return head.toString();
    }
}
