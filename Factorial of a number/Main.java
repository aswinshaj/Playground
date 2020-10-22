#include<iostream>
int main(){
  int num,factorial=1;
	std::cin>>num;
	for (int a=1;a<=num;a++) {
		factorial=factorial*a;
	}
	std::cout<<factorial;
	return 0;
}