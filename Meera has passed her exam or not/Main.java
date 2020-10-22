#include<iostream>
int main()
{
  int a[10],n,c,i,count=0;
  std::cin>>n;
  for(i=0;i<n;i++)
  std::cin>>a[i];
  std::cin>>c;
  for(i=0;i<n;i++)
    if(c==a[i])
      count++;
  if(count==0)
    std::cout<<"She failed";
  else
    std::cout<<"She passed her exam";
}