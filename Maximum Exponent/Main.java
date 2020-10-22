#include <iostream>
using namespace std;
int MaxExponent(int a,int b)
{
  int pow,num;
  for(int i=a;i<=b;i++)
  {
    int ctr=0;
    int n=i;
    while(n!=0)
    {
      if(n%2!=0)
        break;
      else
      {
        ctr++;
        n/=2;
      }
    }
    if(ctr>pow)
    {
      pow=ctr;
      num=i;
    }
  }
  cout<<num;
}
    
int main() 
{
   int a,b;
  cin>>a>>b;
  MaxExponent(a,b);
    return 0;
}