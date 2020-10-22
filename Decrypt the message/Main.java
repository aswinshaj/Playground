#include<iostream>
using namespace std;
int main()
{
  int i, num,num1,num2, div, sum=0;
    std::cin >> num1;
    std::cin>>num2;
    num=num1+num2;
    for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        std::cout<<"They can read the message";
    else
        std::cout << "They can't read the message";
}