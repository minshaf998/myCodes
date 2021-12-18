//This logic is little bit hard, so i stop this from here. !not completed!
public class queueLinkedList {
    public static void main(String[] args) {
        queue q = new queue();

        System.out.println(q.isEmpty());
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.isEmpty());
        q.print();
        System.out.println(q.pop());
        q.print();

    }
}

class queue {
    Node head;
    Node tail;

    queue() {
        head = new Node();
        tail = new Node();
        head.next = tail;
    }

    public boolean isEmpty() {
        return head.next == tail;
    }

    public boolean isFull() {
        return false;
    }

    public void push(int val) {
        Node node = new Node(val);

        if (isEmpty()) {
            head.next = node;
            node.next = tail;
        } else {
            node.next = head.next;
            head.next = node;
        }
    }

    public int pop() {
        if (isEmpty())
            return 0;
        else {
            Node curreNode = head;
            while (curreNode.next != tail) {
                curreNode = curreNode.next;
            }
            return curreNode.value;
        }
    }

    // public int peek(){
    // return
    // }

    public void print() {
        Node currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
            System.out.print(currentNode.value + " ");
        }
        System.out.println();
    }

}

class Node {
    public Node next;
    public int value;

    Node() {
        next = null;
    }

    Node(int val) {
        next = null;
        value = val;
    }
}