class queueLinkedList2 {
    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.isEmpty());
        q.push(3);
        System.out.println(q.isEmpty());
        q.print();
        q.push(4);
        q.push(5);
        q.print();

        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.peek());

    }
}

class queue {
    Node head;
    Node tail;

    public queue() {
        head = new Node();
        tail = head;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public void push(int val) {
        Node node = new Node(val);
        if (isEmpty()) {
            head.next = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.print(currentNode.next.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public int pop() {
        if (isEmpty())
            return 0;
        else {
            int val = head.next.value;
            if (head.next.next != null) {
                head.next = head.next.next;
                return val;
            } else {
                head.next = null;
                return val;
            }
        }
    }

    public int peek() {
        if (isEmpty())
            return 0;
        return head.next.value;
    }
}

class Node {
    Node next = null;
    int value;

    public Node() {

    }

    public Node(int val) {
        value = val;
    }
}