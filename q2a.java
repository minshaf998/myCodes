class testmain{
	public static void main(String args[]){
		//System.out.println("HI");
		
	}
	
	public int T(int n){
		if( n==1 ) return 1;
		else if ( n > 1 ) return T(n-1) + n;
		return -1;
}
