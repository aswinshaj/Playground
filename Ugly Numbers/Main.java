#include <iostream>
using namespace std;
int divide(int a, int b)
{
  while(a%b==0)
  
    a=a/b;
  
  return a;
}
 int ugly(int x)
 {
   x= divide(x,2);
   x= divide(x,3);
   x= divide(x,5);
   
   if(x==1)
     return 1;
   else
     return 0;
 }

int main() 
{
  int t;
  cin>>t;
  while(t!=0)
  {
    int n;
    cin>>n;
    int ctr=1;
    int i=1;
    for(;n>ctr;)
    {
      i++;
      if(ugly(i))
      {
        ctr++;
        
      }
      
    }
    cout<<i<<endl;
    t--;
  }
  
    return 0;
}