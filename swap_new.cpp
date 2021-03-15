#include <iostream>

using namespace std;

void swap(int* p, int* q){
	int t = *p;
	*p = *q;
	*q = t;
}

int main(){
	int a = 10;
	int b = 20;
	
	cout << a << "\n";
	cout << b << "\n";
	swap(&a,&b);
	cout << a << "\n";
	cout << b << "\n";
	return 0;
	
}
