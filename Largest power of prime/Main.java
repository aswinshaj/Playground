#include <bits/stdc++.h>
using namespace std;

int main() 
{
  
  int t;
  cin>>t;
  
  while(t!=0)
  {
    int n,p;
    cin>>n>>p;
    int ctr=0;
    int x=n;
    while(x!=0)
    {
      x/=p;
      ctr+=x;
    }
    cout<<ctr<<endl;
    t--;
  }
  
  
    return 0;
}