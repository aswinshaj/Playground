#include <iostream>
using namespace std;
bool check(int num,int current)
{
  if(num==current)
  {
    return true;
  }
  else if(current>num)
  {
    return false;
  }
  else
  {
    if(check(num,10*current))
       return true;
     if(check(num,20*current))
       return true;
  }
}    
   

int main() 
{
   int t;
  cin>>t;
  while(t!=0)
  {
    int n;
    cin>>n;
    if(check(n,1))
    {
      cout<<"Yes";
    }
    else
      cout<<"No";
    cout<<endl;
    t--;
  }
  
    return 0;
}