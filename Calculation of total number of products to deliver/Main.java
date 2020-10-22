#include <iostream>
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
  for(int i=0;i<n;i++)
  {
    int x=arr[i];
    int sum=0;
    while(x!=0)
    {
      
      sum+=x%10;
      x/=10;
    }
    cout<<sum<<" ";
  }
    return 0;
}