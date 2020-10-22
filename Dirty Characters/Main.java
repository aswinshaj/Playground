#include <bits/stdc++.h>
#include<stdio.h>
using namespace std;
void removeDirtyChars(string str,string str_mask)
{
  int arr[128]={0};
  for(int i=0;i<str.length();i++)
  {
    arr[str[i]]++;
  }
  for(int i=0;i<str_mask.length();i++)
  {
    arr[str_mask[i]]=0;
  }
  str_mask="";
  int pos=0;
  for(int i=0;i<str.length();i++)
  {
    if(arr[str[i]]!=0)
    { 
      str_mask.push_back(str[i]);
      
    }
   }
 
  cout<<str_mask;
}
      
  
  
    
int main() 
{
   string str,str_mask;
getline(cin,str);
  getline(cin,str_mask);
  removeDirtyChars(str,str_mask);
    return 0;
}