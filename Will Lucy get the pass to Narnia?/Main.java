 #include<iostream>
using namespace std;
  int main()
{ int a,b,op;
 cout<<"Enter first number : ";
 cin>>a;
 cout<<"Enter second number : ";
 cin>>b;
 cout<<"Menu\n";
 cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
 cin>>op;
 switch(op) {
   case 1:
cout<< a+b;
     break;
   case 2:
cout<<a-b;
     break;
   case 3:
 cout<<a*b;
     break;
   case 4:
 cout<<a/b;
     break;
   case 5:
 cout<<a%b;
     break;
   default:
  cout<<"Invalid operation";
 }
}