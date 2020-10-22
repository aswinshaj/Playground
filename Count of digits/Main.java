 #include<iostream>
using namespace std;
int main()
{
  int num, temp;
    int count = 0;

    // Take input from user
    cin >> num;

    // Store to temporary variable.
    temp = num;
    
    do{

        // Increment counter
        count++;

        // Remove last digit of 'temp'
        temp /= 10;
    }while(temp!=0);

    cout<< count;

    return 0;}