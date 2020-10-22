#include<stdio.h>
int dec_to_bin(int n)
{
  int i=n;
  int ctr=0;
  while(i!=0)
  {
    ctr++;
    i/=2;
  }
  return ctr;
  
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
