#include<iostream>
int main()
{
  int n,m,i,j;
  std::cin>>n>>m;
  int a[n][m],b[n][m],c[n][m];
  for(i=0;i<n;i++)
    for(j=0;j<m;j++)
      std::cin>>a[i][j];
  for(i=0;i<n;i++)
    for(j=0;j<m;j++)
      std::cin>>b[i][j];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
      std::cout<<c[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}