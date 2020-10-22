#include<bits/stdc++.h>
using namespace std;

int main() 
{
   int a,arr[15];
  cin>>a;
  int x=a;
  int n=0;
  while(x!=0)
  {
    arr[n]=x%10;
    x/=10;
    n++;
  }
    sort(arr,arr+n);
  for(int i=0;i<n;i++)
  {
    cout<<arr[i]<<' ';
  }
    return 0;
}