#include<iostream>
int main()
{
  int max,flor;
  std::cin>>max>>flor;
  if(max>flor)
    std::cout<<"Yes, you can enter.";
  else if(max==flor)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}