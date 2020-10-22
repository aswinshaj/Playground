#include <bits/stdc++.h>
using namespace std;

int main() 
{
   char s[100];
   gets(s);
  
  int stop= strlen(s)-1;
  int start;
  for(int i=strlen(s)-1;i>=0;i--)
  {
    if(s[i]==' ' || i==0)
    {
      if(i==0)
      {
        start=0;
      }
      else 
      {
        start=i+1;
      }
      
      for(int j=start;j<=stop;j++)
      { 
        cout<<s[j];
      }
      stop=i-1;
      cout<<' ';
    }
  }
    return 0;
}