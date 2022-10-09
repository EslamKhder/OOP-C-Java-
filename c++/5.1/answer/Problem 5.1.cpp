#include<iostream>
using namespace std;
class Employee {
	private:
		int id = 0;
		string name = "";
		string number = "";
	public:
		/*void setId(int id){ // -1
			if(id > 0){
				this->id = id;
			} else {
				cout<<"Invalid Id"<<endl;
			}
			
		}*/
		void setId(int id){ // -1
				this->id = id;
		}
		void setName(string name){
			this->name = name;
		}
		/*void setNumber(string number){
			if(number.size() <= 2){
				this->number = number;
			} else {
				cout<<"Invalid Number"<<endl;
			}
		}*/
		
		void setNumber(string number){
				this->number = number;
		}
		
		int getId(){
			return id;
		}
		
		string getName(){
			return name;
		}
		
		string getNumber(){
			return number;
		}
		
};
class Master {
	private:
		int id = 0;
		string name = "";
		double age = 0;
	public:
		/*void setId(int id){ // -1
			if(id > 0){
				this->id = id;
			} else {
				cout<<"Invalid Id"<<endl;
			}
			
		}*/
		void setId(int id){ // -1
				this->id = id;
		}
		void setName(string name){
			this->name = name;
		}
		/*void setAge(double age){
			if(age> 7 && age <30){
				this->age = age;
			} else {
				cout<<"Invalid age"<<endl;
			}	
		}*/
		void setAge(double age){
				this->age = age;
		}
		int getId(){
			return id;
		}
		
		string getName(){
			return name;
		}
		
		double getAge(){
			return age;
		}
		
};

class Validation {
	public:
		bool validateId(int id){
			if(id <= 0) { // 0 - 1 -2 
				cout<<"Invalid Id"<<endl;
				return false;
			}
			return true;
		}
		bool validateNumber(string number){
			if(number.size() > 2){ // size = 3 4 5 6 7
				cout<<"Invalid Number"<<endl;
				return false;
			}
			return true;
		}
		bool validateAge(double age){
			if(!(age> 7 && age <30)){ // 2 flase
				cout<<"Invalid age"<<endl;
				return false;
			}
			return true;
		}
};
int main(){
	
	Validation v;
	
	Employee e;
	e.setId(1);
	bool v1 = v.validateId(e.getId());
	e.setName("eslam");
	e.setNumber("10");
	bool v2 = v.validateNumber(e.getNumber());
	if(v1 && v2){
		cout<<e.getId()<<" - "<<e.getName()<<" - "<<e.getNumber()<<endl;
	}
	
	
	Master m;
	m.setId(3);
	bool v3 = v.validateId(m.getId());
	m.setName("ahmed");
	m.setAge(200);
	bool v4 = v.validateAge(m.getAge());
	if(v3 && v4){
		cout<<m.getId()<<" - "<<m.getName()<<" - "<<m.getAge()<<endl;
	}

	
	
	
	
	
	
}
