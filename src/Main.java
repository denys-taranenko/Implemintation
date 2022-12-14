import task_1.MyArrayList;
import task_2.MyLinkedList;
import task_3.MyQueue;
import task_4.MyStack;
import task_5.MyHashMap;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(15);
        myArrayList.add("Hello Java");
        System.out.println(myArrayList); //[15, Hello Java, null, null, null, null, null, null, null, null]

        myArrayList.remove(0);
        System.out.println(myArrayList); //[Hello Java, null, null, null, null, null, null, null, null, null]

        System.out.println(myArrayList.size()); //1

        System.out.println(myArrayList.get(0)); //Hello Java

        myArrayList.clear();

        System.out.println(myArrayList); //[null, null, null, null, null, null, null, null, null, null]

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(15);
        myLinkedList.add("Hello Java");
        System.out.println(myLinkedList); //Hello Java 15

        myLinkedList.remove(0);
        System.out.println(myLinkedList); //Hello Java

        System.out.println(myLinkedList.size()); //1

        System.out.println(myLinkedList.get(0)); //15

        myLinkedList.clear();
        System.out.println(myLinkedList); //Exception - because "this.head" is null

        MyQueue myQueue = new MyQueue<>();
        myQueue.add(15);
        myQueue.add("Hello Java");
        System.out.println(myQueue); //[null, null, null, null, null, null, null, null, Hello Java, 15]

        System.out.println(myQueue.size()); //2

        System.out.println(myQueue.peek()); //15

        System.out.println(myQueue.poll()); //15

        myQueue.clear();
        System.out.println(myQueue); //[null, null, null, null, null, null, null, null, null, null]

        MyStack myStack = new MyStack(10);
        myStack.push(15);
        myStack.push("Hello Java");
        System.out.println(myStack); //[15, Hello Java, null, null, null, null, null, null, null, null]

        myStack.remove(0);
        System.out.println(myStack); //[Hello Java, null, null, null, null, null, null, null, null, null]

        System.out.println(myStack.size()); //9

        System.out.println(myStack.peek());

        System.out.println(myStack.pop());

        myStack.clear();

        System.out.println(myStack); //[null, null, null, null, null, null, null, null, null, null]

        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(0,15);
        myHashMap.put(1,15);
        System.out.println(myHashMap); //[key = 0, value = 15, null, null, null, null]

        myHashMap.remove(0);
        System.out.println(myHashMap); //[null, key = 1, value = 15, null, null, null]

        System.out.println(myHashMap.size()); //5

        myHashMap.get(1);
        System.out.println(myHashMap);

        myHashMap.clear();
        System.out.println(myHashMap); //[null, null, null, null, null]
    }
}
