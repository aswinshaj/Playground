#include<stdio.h>
int dec_to_bin(int n)
{
  int bin,i=1;
   while(n!=0)
   {
     bin+= (n%2)*i;
     i*=10;
     n/=2;
   }
  return bin;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
