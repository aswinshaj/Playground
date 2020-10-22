#include<bits/stdc++.h>
using namespace std;

int main()
{ 
int n, i;
  long int fact=1;
cin>>n;

for(i =1; i <= n; i++)
{
     fact*=i;
}

cout<<fact;  
return 0;
}
