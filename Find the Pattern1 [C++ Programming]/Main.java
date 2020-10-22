#include <iostream>
using namespace std;
int pattern(int n)
{
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n;j++)
    {
      if(j==1 || j==n ||i==1 || i==n)
        cout<<"1";
      else
        cout<<" ";
    }
    cout<<"\n";
  }
}
int main()
{
    int n;
    cin>>n;
    pattern(n);
}
