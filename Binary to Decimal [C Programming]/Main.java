#include<stdio.h>
int bin_to_dec(int n)
{
  int dec;
  int i=0;
    while(n!=0)
    {
      dec+= (n%10)*pow(2,i);
      n/=10;
      i++;
    }
  return dec;
      
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}