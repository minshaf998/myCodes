class queueArray{
    public static void main(String[] args) {
        queue q = new queue(5);
        System.out.println(q.isFull());
        System.out.println(q.isEmpty());
        q.push(4);
        q.push(6);
        q.push(9);
        System.out.println(q.pop());
        System.out.println(q.pop());
        

    }
}

class queue{

    int arr[];
    int point = 0;
    int count = -1;

    public queue(int val){
        arr = new int[val];
    }

    public void push(int val){
        if (isFull()) return;
        else arr[++count] = val;
    }

    public boolean isFull(){
        return count == arr.length;
    }

    public boolean isEmpty(){
        return count == -1;
    }

    public int pop(){
        if(isEmpty()) return 0 ;
            return arr[point++];
    }

    public int peek(){
        if (isEmpty()) return 0;
        else return arr[point];
    }
}