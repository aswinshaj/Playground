#include <iostream>
using namespace std;

int main() 
{
   int t;
  cin>>t;
  
  while(t>0)
  {
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
      cin>>arr[i];
    }
    for(int i=0;i<n-1;i++)
    {
      int x=0;
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]<arr[j])
        {
          x=1;
          break;
        }
      }
      if(x==0)
        cout<<arr[i]<<' ';
    }
    cout<<arr[n-1]<<endl;
    t--;
  }
      
    return 0;
}