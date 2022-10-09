#include<iostream>
using namespace std;
class Employee {
	public:
		string name;
		int number;
};

class EmployeeValidation {
	public:
		bool validateName(string name){
			if(name.size() <= 5){ // 1 2 3 4 5      name.size() > 5
				cout<<"Invalid Name"<<endl;
				return false;
			}
			return true;
		}
		
		bool validateNumber(int number){
			if(number <= 0){ // 0 -1    name.size() > 5
				cout<<"Invalid Number"<<endl;
				return false; 
			}
			return true;
		}
};
int main(){
	Employee e;
	e.name="Eslam 1";
	e.number=1; // 0
	EmployeeValidation ev;
	
	if(ev.validateName(e.name) && ev.validateNumber(e.number)){
		cout<<e.name<<"   -   "<<e.number<<endl;
	}
	
	
	
	
	
}
