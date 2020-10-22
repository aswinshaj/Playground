#include<iostream>
int main()
{
  int a[10],n,l=0,i;
  std::cin>>n;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(l<a[i])
      l=a[i];
  }
  std::cout<<l;
}