#include <bits/stdc++.h>
using namespace std;

int main() 
{
  char ch[50];
  cin>>ch;
  int i=0,n=strlen(ch);
  int x=0,y=strlen(ch)-1;
  
  for(i=0;i<n;i++,x++,y--)
  {
    for(int j=0;j<n;j++)
    {
      if(x==j || y==j)
        cout<<ch[j];
      else 
        cout<<" ";
    }
    cout<<'\n';
  }
  
  
    
    return 0;
}