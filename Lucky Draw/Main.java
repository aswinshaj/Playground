#include <iostream>  
using namespace std;  
int main()  
{  
  int n, i=1, flag=0;   
  std::cin >> n;
   do{
      if(n%i==0) {
         flag++;
      }
     i++;
   }while(i<=n);
   if (flag==2)
      std::cout<<"Eligible";
   else
      std::cout<<"Not eligible";
}