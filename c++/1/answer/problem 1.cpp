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
	cout<<"Please Enter Your Id :";
	cin>>e.id;
	cout<<"Please Enter Your Name :";
	cin>>e.name;
	cout<<"Please Enter Your Age :";
	cin>>e.age;
	
	cout<<e.id<<" - "<<e.name<<" - "<<e.age<<endl;
}
