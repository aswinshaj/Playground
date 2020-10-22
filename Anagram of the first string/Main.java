#include <bits/stdc++.h>
using namespace std;

int main() 
{
   string s1,s2;
  cin>>s1>>s2;
  int ctr[128]={0};
  for(int i=0;i<s1.length();i++)
  {
    ctr[s1[i]]++;
  }
   for(int i=0;i<s2.length();i++)
  {
    ctr[s2[i]]--;
  }
   for(int i=0;i<128;i++)
  {
    if(ctr[i]!=0)
    {
      cout<<"Not anagrams";
      return 0;
    }
   }
  cout<<"Anagram";
  
    return 0;
}