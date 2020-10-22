#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  int avg=0;
  long long b[n+1];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    avg+=arr[i];
  }
  avg/=n;
  b[0]=0;
  for(int i=1;i<n;i++)
  {
    b[i]=arr[i-1] + b[i-1]-avg;
  }
  sort(b,b+n);
  int m= -b[n/2];
  int s=0;
  for(int i=0;i<n;i++)
  {
    s+=(abs(b[i]+m));
  }
  
   cout<<s;
  
   return 0;
}