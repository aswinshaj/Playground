#include <bits/stdc++.h>

using namespace std;

int main() 
{
  int s,m,n;
  long long ans;
  cin>>s>>n>>m;
  ans=pow(s,n);
  ans=ans%10;
  ans=pow(ans,m);
  ans=ans%1000000007;
  cout<<ans;
  
    return 0;
}