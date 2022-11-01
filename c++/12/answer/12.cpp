#include<iostream>
using namespace std;

class Facebook {
	private:
		int id;
		string text;
		string image;
	public:
		Facebook(int id,string text,string image) {
			this->id = id;
			this->text = text;
			this->image = image;
		}
		int getId(){
			return id;
		}
		string getText(){
			return text;
		}
		string getImage(){
			return image;
		}
};
int main(){
	Facebook f(1,"Post","Image");
	cout<<f.getId()<<"   "<<f.getText()<<"    "<<f.getImage()<<endl;
}
