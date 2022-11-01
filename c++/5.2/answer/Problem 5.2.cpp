#include<iostream>
using namespace std;
class BaseEntity {
	public:
		int id;
		string name;
};
class ShareData {
	public:
		string phone;
};
class Person: public BaseEntity {
	public:
		
};
class Player: public BaseEntity,public ShareData {
	public:
		string number;
};
class Student: public BaseEntity,public ShareData {
	public:
		double age;
};

int main(){
	Person p;
	p.id = 5;
	p.name="Eslam";
	cout<<p.id<<"  "<<p.name<<endl;
	
	Player pl;
	pl.id = 10;
	pl.name = "Karim";
	pl.number = "10";
	pl.phone = "01113903660";
	
	cout<<pl.id<<"  "<<pl.name<<"  "<<pl.number<<"   "<<pl.phone;
}
