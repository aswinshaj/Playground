#include <iostream>
using namespace std;



int main() 
{
   int t;
  cin>>t;
  while(t!=0)
  {
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
      cin>>arr[i];
    }
    int start=0;
    int end =n-1;
    int ctr=0;
    while(start<end)
    {
      if(arr[start]==arr[end])
      {
        start++;
        end--;
      }
      if(arr[start]<arr[end])
      {
        arr[start+1]+=arr[start];
         start++;
        ctr++;
      }
       if(arr[start]>arr[end])
      {
        arr[end-1]+=arr[end];
        end--;
        ctr++;
      }
      
    }
    cout<<ctr<<endl;
    t--;
  }
    
    return 0;
}