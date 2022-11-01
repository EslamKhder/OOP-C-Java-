#include<iostream>
using namespace std;
class Student {
	public:
		int id;
		string name;
};
class SchoolService {
	public:
		virtual Student addStudent(Student stu) = 0;
		virtual Student showStudent(Student stu) = 0;
};
class SchoolServiceImpl: SchoolService {
	public:
		Student addStudent(Student stu){
			return stu;
		}
		Student showStudent(Student stu){
			return stu;
		}
};

class SchoolServiceImpl1: SchoolServiceImpl{
	public:
		Student addStudent(Student stu){
			cout<<stu.id<<"    "<<stu.name<<endl;
			return stu;
		}
};
class SchoolServiceImpl2: SchoolServiceImpl{
	public:
		Student showStudent(Student stu){
			cout<<stu.id<<"    "<<stu.name<<endl;
			return stu;
		}
};
int main(){
	Student s;
	s.id = 1;
	s.name = "Eslam";
	
	SchoolServiceImpl1 s1;
	s1.addStudent(s);
	
	s.id = 2;
	s.name = "Ahmed";
	SchoolServiceImpl2 s2;
	s2.showStudent(s);
}
