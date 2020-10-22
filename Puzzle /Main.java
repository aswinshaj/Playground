#include<iostream>
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c],b[c][r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for (i=0;i<c;i++)
    for(j=0;j<r;j++)
      b[i][j]=a[j][i];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      std:: cout<<b[i][j]<<" ";
    std::cout<<"\n";
  }
}