class stackArray{
	public static void main(String args[]){
		// System.out.println("Hello world");
		stack numStack = new stack(5);
		System.out.println(numStack.isEmpty());
		numStack.push(2);
		numStack.push(5);
		System.out.println(numStack.pop());
		// System.out.println(numStack.peek());
		System.out.println(numStack.peek());
		System.out.println(numStack.peek());
		System.out.println(numStack.pop());
		System.out.println(numStack.pop());

		// System.out.println(numStack.pop());
		// System.out.println(numStack.peek());
	}
}

class stack{
	
	int count = -1;
	int arr[];

	public stack(int val){
		arr = new int[val];
	}

	public void push(int num){
		if(this.isFull()){
			return;
		}
		else{
			count++;
			arr[count] = num;
		}
	}

	public boolean isEmpty(){
		return count<0;
	}

	public boolean isFull(){
		return count == arr.length;
	}

	public int pop(){
		if(this.isEmpty()){
			return 0;
		}
		else{
			int val = arr[count];
			count--;
			return val;
		}
	}

	public int peek(){
		if (this.isEmpty()) return 0;
		else return arr[count];
	}
	
}