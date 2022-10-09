#include<iostream>
using namespace std;
class Calculator {
	public: 
		int num1;
		int num2;
		int num3;
	
	int sumOfEvenNumber(){
		if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0){
				return num1 + num2 + num3;
		}
		return -1;
	}
};
int main(){
	Calculator c;
	cout<<"Please Enter num 1 : ";
	c.num1 = 6; // odd
	c.num2 = 10; // even
	c.num3 = 4; // odd
	int result = c.sumOfEvenNumber();
	if(result == -1){
		cout<<"Your Numbers must be even"<<endl;
	} else {
		cout<<"Result : "<<result;
	}
	
}
