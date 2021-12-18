class stackLinkedList {
    public static void main(String[] args) {
        List list = new List();
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

        list.print();
        list.pop();
        list.print();
        list.print();
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        // System.out.println(list.pop());
        // System.out.println(list.pop());

    }
}

class List {

    Node head;
    Node tail;

    public List() {
        head = new Node();
        tail = new Node();
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public boolean isFull() {
        return false;
    }

    public void push(int val) {
        Node node = new Node(val);

        if (isEmpty()) {
            head.next = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
    }

    public int peek() {
        if (isEmpty())
            return 0;
        else
            return tail.value;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        } else {

            Node currentNode = head;

            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }

            int val = tail.value;
            tail = currentNode;
            return val;
        }
    }

    public void print() {
        Node h = head;
        while (h != tail) {
            System.out.print(h.value + " ");
            h = h.next;
        }
        System.out.println(tail.value);
    }

}

class Node {
    public Node next = null;
    public int value;

    public Node() {

    }

    public Node(int val) {
        value = val;
    }
}