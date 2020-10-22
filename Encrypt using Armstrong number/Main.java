#include<iostream>
#include<math.h>
int arm(int n)
{
  int num,remainder,originalNum,power,result;
  originalNum = n;
  while (originalNum != 0)
  {
    originalNum /= 10;
    ++num;
    }
  originalNum = n;
  while (originalNum != 0)
    {
    remainder = originalNum % 10;
    power = round(pow(remainder, num));
    result += power;
    originalNum /= 10;
    }
  if(result==n)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}