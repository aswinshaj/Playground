#include <bits/stdc++.h>
using namespace std;

int prime(int x)
{
  for(int i=2;i*i<=x;i++)
  {
    if(x%i==0)
    {
      return 0;
    }
  }
  return 1;
}
int main() 
{
   int t;
  cin>>t;
  while(t!=0)
  {
    int n;
    cin>>n;
    for(int i=n,y=n;;i--,y++)
    {
     if(i>=0 && prime(i))
     {
       cout<<i<<endl;
       break;
     }
      else if(prime(y))
      {
        cout<<y<<endl;
        break;
      }
    }
      t--;
    }
    return 0;
}