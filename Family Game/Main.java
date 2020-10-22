#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n,x;
  cin>>n;
  x=n;
  string s;
  cin>>s;
  bool pos[n];
  memset(pos,true,sizeof(pos));
  int z=s.length();
  int i=0,j=0;
  while(n!=1)
  {
    if(pos[i]==true)
    {
      if(s[j]=='y')
      {
        pos[i]=false;
        n--;
        j++;
      }
      else
        j++;
    }
    i++;
    
    if(i>=x)
      i=0;
    if(j>=z)
      j=0;
    }
   
 
  int ctr;
  for(i=0;i<x;i++)
  {
    if(pos[i]==true)
    {ctr=i;
     break;
    }
  }
  cout<<++ctr;
  return 0;
}