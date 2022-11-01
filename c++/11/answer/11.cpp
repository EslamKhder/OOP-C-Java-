#include<iostream>
using namespace std;
class Restaurant {
	public:
		int id;
		string order;
};
class RestaurantService {
	
	public:
		Restaurant addOrder(Restaurant restaurant){
			return restaurant;
		}
		virtual void showOrder() {
			
		};
};
int main(){
	Restaurant r;
	r.id = 1;
	r.order = "Order";
	
	RestaurantService rs;
	cout<<rs.addOrder(r).id<<"   "<<rs.addOrder(r).order;
	
	
}
