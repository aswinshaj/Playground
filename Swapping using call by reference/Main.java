#include<iostream>
int main()
{
int x, y, t;
  scanf("%d%d", &x, &y);

  printf("Before swapping a= %d and b=%d\n", x, y);

  t = x;
  x = y;
  y = t;

  printf("After swapping a= %d and b=%d\n", x, y);
  }