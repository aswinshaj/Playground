#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    int i=1;
  int oct=0;
  while(n!=0)
  {
    oct+=(n%8)*i;
    n/=8;
    i*=10;
  }
  return oct;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
