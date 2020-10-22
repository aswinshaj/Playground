#include <bits/stdc++.h>
using namespace std;

int main() 
{
   int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  
 int l=0,r=n-1;
  
  while(1)
  {
    if(l>=r)
      break;
    if(arr[l]==0)
    {
      l++;
    }
    else if(arr[r]==1)
    {
      r--;
    }
    else
    {
      swap(arr[l],arr[r]);
      l++;
      r--;
    }
  }       
for(int i=0;i<n;i++)
  {
    cout<<arr[i];
}
    return 0;
}