#include<iostream>
using namespace std;
class Player{
	private:
		int id;
		string name;
		string number;
	
	public:
		void setId(int id){
			this->id = id;
		}
		
		void setName(string name){
			this->name = name;
		}
		
		void setNumber(string number){
			this->number = number;
		}
		
		int getId(){
			return this->id;
		}
		string getName(){
			return this->name;
		}
		string getNumber(){
			return this->number;
		}
};
class Student {
	private:
		int id;
		string name;
		double age;
		
	public:
		void setId(int id){
			this->id = id;
		}
		
		void setName(string name){
			this->name = name;
		}
		
		void setAge(double age){
			this->age = age;
		}
		
		int getId(){
			return this->id;
		}
		string getName(){
			return this->name;
		}
		double getAge(){
			return this->age;
		}
};
int main(){
	Player p;
	/*p.id = 1;
	p.name = "eslam";
	p.number = "10";*/
	p.setId(1);
	p.setName("Eslam");
	p.setNumber("10");
	
	//cout<<s.id<<" - "<<s.name<<" - "<<s.number<<endl;
	cout<<p.getId()<<" - "<<p.getName()<<" - "<<p.getNumber()<<endl;
	
	Student s;
	/*s.id = 2;
	s.name = "Ahmed";
	s.age = 22.5;*/
	s.setId(2);
	s.setName("Ahmed");
	s.setAge(22.5);
	
	//cout<<s.id<<" - "<<s.name<<" - "<<s.age<<endl;
	cout<<s.getId()<<" - "<<s.getName()<<" - "<<s.getAge()<<endl;
}
