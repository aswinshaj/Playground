#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    char ch[50],ch1[50];
    cin>>ch>>ch1;
    int j;
    for(j=0;j<strlen(ch);j++)
    {
      if(ch1[0]==ch[j])
        break;
    }
    int flg=0;
    for(int i=0;i<strlen(ch1);i++)
    {
      if(ch1[i]!=ch[j])
      {
        flg=1;
      }
      j++;
    }
    if(flg==0)
      cout<<"Yes"<<'\n';
    else
      cout<<"No"<<'\n';
  }
    
        
    return 0;
}