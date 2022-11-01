#include<iostream>
using namespace std;
class BaseEntity {
	public:
		int id;
		string name;
		int number;
};
class ClupFc: public BaseEntity{
	public:
		int code;	
};
class ClupRel: public BaseEntity {
	public:
		int licence;
};
class PlayerService {
	public:
		void print_1(int id,string name,int number){
			cout<<id<<"  "<<name<<"  "<<number<<" ";
		}
};
class ClupFcService: public PlayerService{
	public:
		void print_2(ClupFc cf){
			this->print_1(cf.id,cf.name,cf.number);
			cout<<cf.code<<endl;
		}
};
class ClupRelService : public PlayerService{
	public:
		void print_2(ClupRel cf){
			this->print_1(cf.id,cf.name,cf.number);
			cout<<cf.licence<<endl;
		}
};
int main(){
	ClupFc c1;
	c1.id =1;
	c1.name="Eslam";
	c1.number=10;
	c1.code=987;
	
	ClupFcService s1;
	s1.print_1(c1.id,c1.name,c1.number);
	cout<<endl;
	s1.print_2(c1);
}
