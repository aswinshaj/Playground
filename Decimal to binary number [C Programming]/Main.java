#include <stdio.h>
int main()
{
  
  int n, c, k;
  scanf("%d", &n);
  int flag; 
  for (c = 31; c >= 0; c-=1)
  {
    k = n >> c;
    if (k & 1)
    {
      printf("1");
    }
    else 
    {
      printf("0");
    }
  }
  printf("\n");
  return 0;
  
}
