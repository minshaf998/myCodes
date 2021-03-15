class recursionTest{
	public static void main(String args[]){
		int n1 = 10;
		int n2 = 20;
		
		System.out.println(n1+" "+n2);
		swap(n1,n2);
		System.out.println(n1+" "+n2);
		
	}
	
	public static void swap(int a,int b){
		int t = a;
		a = b;
		b = t;
		System.out.println(a+" "+b);
		
	}
		
}
