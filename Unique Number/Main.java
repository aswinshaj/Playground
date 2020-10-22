#include <iostream>
using namespace std;

void unique(int a, int b)
{
  int ctr=0;
  for(int i=a;i<=b;i++)
  {
    int m=i;
    bool num[10]={false};
    while(m)
    {
      if(num[m%10])
        break;
      num[m%10]=true;
      m/=10;
    }
    if(m==0)
      ctr++;
  }
  if(ctr==0)
    cout<<"No Unique Number";
  else
    cout<<ctr;
}
  
int main() 
{
   int x,y;
  cin>>x>>y;
  unique(x,y);
    return 0;
}