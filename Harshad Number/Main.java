#include<iostream>
using namespace std;
int main()
{
  int n,i,k,sum=0;
  cin>>n;
  for(i=n;i>0;i=i/10)
  {
    k=i%10;
    sum=sum+k;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  
}