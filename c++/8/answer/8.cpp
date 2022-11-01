#include<iostream>
using namespace std;

class BaseEntity {
	public:
		int id;
		string text;
		string image;
};
class AppService {
	public:
		virtual void printPost(BaseEntity be) = 0;
};
class AppCommenService {
	public:
		void print(BaseEntity be){
			cout<<"ID :"<<be.id<<"   "<<"Text :  "<<be.text<<"   "<<"Image : "<<be.image<<endl;
		}
};
class AppFacebook: BaseEntity ,AppService,AppCommenService{
	public:
		void printPost(BaseEntity be){
			cout<<"Facebook"<<endl;
			this->print(be);
		}
};
class AppLinkedIn: BaseEntity ,AppService,AppCommenService{
	public:
		void printPost(BaseEntity be){
			cout<<"Linked In"<<endl;
			this->print(be);
		}
};
int main(){
	BaseEntity be;
	be.id = 10;
	be.text = "I am Facebook";
	be.image = "i am Facebook Image";
	AppFacebook fa;
	fa.printPost(be);
	be.id = 100;
	be.text = "I am LinkedIn";
	be.image = "i am LinkedIn Image";
	AppLinkedIn ln;
	ln.printPost(be);
}
