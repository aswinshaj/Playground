#include <bits/stdc++.h>
using namespace std;

int main() 
{
   char str[100];
  gets(str);
  int n;
  cin>>n;
  char ch=str[n-1];
  for(int i=0;i<strlen(str);i++)
  {
    str[i]=ch;
  }
  cout<<str;
    return 0;
}