public class queueUsingStack {
    public static void main(String[] args) {
        queue q = new queue();

        System.out.println(q.isEmpty());

    }
}

class queue {
    stackLinkedList stack1;
    stackLinkedList stack2;

    public queue() {
        stack1 = new stackLinkedList();
        stack2 = new stackLinkedList();
    }

    public boolean isEmpty(){
        return stack1.isEmpty()
    }
}