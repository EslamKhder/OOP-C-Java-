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

class PublicClub: public BaseEntity {
	private:
		int codePublicClub;
	public:
		void setCodePublicClub(int codePublicClub){
			this->codePublicClub = codePublicClub;
		}
		int getCodePublicClub(){
			return codePublicClub;
		}
};

class PrivateClub: public BaseEntity {
	private:
		int codePrivateClub;
	public:
		void setCodePrivateClub(int codePrivateClub){
			this->codePrivateClub = codePrivateClub;
		}
		int getCodePrivateClub(){
			return codePrivateClub;
		}
};

class PlayerPublicClubService {
	virtual void savePlayer(PublicClub publicClub) = 0;
};
class PlayerPrivateClubService {
	virtual void savePlayer(PrivateClub privateClub) = 0;
};

class PublicClubService: public PlayerPublicClubService {
	public:
		void savePlayer(PublicClub publicClub){
			cout<<publicClub.getId()<<"   "<<publicClub.getName()<<"   "<<publicClub.getCodePublicClub()<<endl;
			cout<<"PublicClub Player Save Success"<<endl;
		}
};

class PrivateClubService: public PlayerPrivateClubService  {
	public:
		void savePlayer(PrivateClub privateClub){
			cout<<privateClub.getId()<<"   "<<privateClub.getName()<<"   "<<privateClub.getCodePrivateClub()<<endl;
			cout<<"PrivateClub Player Save Success"<<endl;
		}
};
int main(){
	PublicClub bc;
	bc.setId(1);
	bc.setName("Eslam");
	bc.setCodePublicClub(10);
	
	PublicClubService publicService;
	publicService.savePlayer(bc);
	
	PrivateClub c;
	c.setId(2);
	c.setName("Ahmed");
	c.setCodePrivateClub(7);
	
	PrivateClubService privateService;
	privateService.savePlayer(c);
	
}
