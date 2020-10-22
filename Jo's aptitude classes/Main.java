#include<iostream>
int gcd(int a,int b,int c)
{
  int d,i,x,y,z;
  d=1;
  x=a;
  y=b;
  z=c;
  i=1;
  while(i<=x&&i<=y&&i<=z)
  {
    if(x%i==0&&y%i==0&&x%i==0)
      d=i;
    i++;
  }
  return d;
}
int main()
{
  int x,y,z,m,n;
  std::cin>>x>>y>>z>>m;
  n=gcd(x,y,z);
  if(n==m)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}