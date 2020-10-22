#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int t;
  cin>>t;
  while(t!=0)
  {
    int n;
    cin>>n;
    long long arr[n];
    arr[0]=1;
    arr[1]=6;
    for(int i=2;i<=n;i++)
    {
      arr[i]= (2*(arr[i-1] +2) -arr[i-2]);
    }
    cout<<arr[n-1]<<endl;
    t--;
  }
    return 0;
}