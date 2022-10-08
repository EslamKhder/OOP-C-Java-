#include<iostream>
using namespace std;
class Employee {
	public:
		int id;
		string name;
		double age;
};
int main(){
	Employee e;
	//e.id = 1;
	cout<<"Please Enter Your ID: ";
	cin>>e.id;
	//e.name = "eslam";
	cout<<"Please Enter Your Name: ";
	cin>>e.name;
	//e.age = 22.5;
	cout<<"Please Enter Your Age: ";
	cin>>e.age;
	cout<<e.id<<"  -  "<<e.name<<"  -  "<<e.age<<endl;
	
}
