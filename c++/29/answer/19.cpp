#include<iostream>
using namespace std;
class Circle {
	private:
		double radius;
		const double BI = 22 / 7;
	public:
		
		Circle(){
			
		}
		Circle(double radius){
			this->radius = radius;
		}
		
		void setRadius(double radius){
			this->radius = radius;
		}
		
		double circumference(){
			return 2 * BI * radius;
		}
		double area(){
			return  BI * radius * radius;
		}
};
int main(){
	cout<<"Please Enter Your radius"<<endl;
	double radius;
	cin>>radius;
	
	Circle circle;
	circle.setRadius(radius);
	cout<<"circumference = "<<circle.circumference()<<endl;
	cout<<"area = "<<circle.area()<<endl;
}
