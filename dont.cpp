#include <iostream>
using namespace std;

void swapA(int & p, int & q){
	int t = p;
	p = q;
	q = p;
}

void swapB(int * p, int * q){
	int t = *p;
	*p = *q;
	*q = *p;
}

int fibNT(int n){
	if( n == 1 || n == 0){
		return 1;
	}
	else{
		return n*fibNT(n-1);
	}
}

int fibinx(int n, int ans){
	if( n == 0 || n == 1 ){
		return ans;
	}
	else{
		return fibinx(n-1, n*ans);
		
	}
}

int fibT(int n){
	return fibinx(n,1);
}

int count(int n){
	if(n==1) return 1;
	else if (n>1) return count(n-1) + n;
	return -1;
}

int foor(int n){
	int ans = 0;
	for(int i=0; i<=n; i++){
		ans += i;
	}
	
	return ans;
}

int main(){

	/*
	int a = 2;
	int b = 4;
	//swap
	cout << "a : " << a << " b : " << b << "\n";
	//swapA(a,b);
	swapB(&a,&b);
	cout << "a : " << a << " b : " << b  << "\n";
	*/
	
	/*
	//factorial non tail
	int aa = fibNT(4);
	cout << aa ;
	*/
	
	/*
	//factorial tail
	int x = fibT(4);
	cout << x;	
	*/
	
	
	//past_paper 2nd Qn
	int x = count(4);
	cout << x;
	
	//itT using for loop
	int f = foor(4);
	cout << f;

	
	
	
	return 0;
	
}


