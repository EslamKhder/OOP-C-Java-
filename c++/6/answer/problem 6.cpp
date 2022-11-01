#include<iostream>
using namespace std;
class BaseEntity {
	private:
		int id;
		string name;
	public:
		void setId(int id){
			this->id = id;
		}
		void setName(string name){
			this->name = name;
		}
		int getId(){
			return id;
		}
		string getName(){
			return name;
		}
};
class PrivateSchool: public BaseEntity {
	
};  
class PublicSchool : public BaseEntity{
	
};  
int main(){ // 
	PrivateSchool ps;
	ps.setId(1);
	ps.setName("Private School");
	
	cout<<ps.getId()<<"  "<<ps.getName()<<endl;
	
	PublicSchool pu;
	pu.setId(2);
	pu.setName("Public School");
	
	cout<<pu.getId()<<"  "<<pu.getName()<<endl;
}
