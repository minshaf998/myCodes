#include <iostream>
using namespace std;

int main(){
	cout << "Hello World \n";

	
	string name = "inshaf \n";
	cout << name;
	
	string *aname = &name;
	cout << aname << "\n";
	
	//cout << name;
	//cout << aname;
	
	cout << *aname;
	
	
	return 0;
}
