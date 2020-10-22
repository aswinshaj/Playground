#include<iostream>
int func(int a,int b)
{
  int sum=1,i;
  for (i=1;i<=b;i++)
    sum=sum*a;
  return sum;
}
int main()
{
  int m,n,req,a;
  std::cin>>m>>n>>req;
  a=func(m,n);
  if(a>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}