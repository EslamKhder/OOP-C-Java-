#include<iostream>
using namespace std;
class Rectangle {
	private:
		double width;
		double height;
	
	public:
		/*Rectangle(double width, double height){
			this->width = width;
			this->height = height;
		}*/
		
		void setWidth(double width) {
			this->width = width;
		}
		void setHeight(double height) {
			this->height = height;
		}
		double area(){
			return height * width;
		}
		
		double perimeter(){
			return height * width * 2;
		}
};
int main(){
	cout<<"Please Enter Width and height"<<endl;
	double width,height;
	cin>>width>>height;
	
	Rectangle rectangle;
	rectangle.setWidth(width);
	rectangle.setHeight(height);
	cout<<"perimeter = "<<rectangle.perimeter()<<endl;
	cout<<"area = "<<rectangle.area()<<endl;
	
	
	
}
