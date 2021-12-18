class Node<T> {
    public T value;
    public Node<T> next;

    Node(T val) {
        value = val;
    }
}

class linkedList<T> {
    Node<T> head;
    Node<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public T searchMax() {
        if (isEmpty()) {
            T a;
            return a;
        } else {
            T max = head.value;
            Node<T> currentNode = head;
            while (currentNode != null) {
                if (max < currentNode.value) {
                    max = currentNode.value;
                }
            }

        }
        return max;
    }
}

class testLinkedList {
    public static void main(String[] args) {
        linkedList<Integer> l = new linkedList<Integer>();
        System.out.println(l.isEmpty());
        l.push(4);
        System.out.println(l.isEmpty());
        l.push(4);
        l.push(4);
        l.print();

    }
}