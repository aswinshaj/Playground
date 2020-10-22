#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int l,r;
  cin>>l>>r;
  bool prime[l+r];
  memset(prime,true,sizeof(prime));
  for(int i=l;i<=r;i++)
  {
    for(int j =2;j*j<=i;j++)
    {
      if(i%j==0)
      {
        prime[i]=false;
        break;
      }
    }
  }
  int ctr=0;
  for(int i=l;i<=r-6;i++)
  { if(prime[i]&&prime[i+6])
    {
      ctr++;
    }
  }
 if(ctr==0)
   cout<<"No Prime Pairs";
 else
    cout<<ctr;

    return 0;
}