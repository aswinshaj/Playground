#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *ch)
{
    int len =strlen(ch);
    for(int i=0;i<len;i++)
    {
      if ((ch[i] == 'A') || (ch[i] == 'E')|| (ch[i] == 'I')|| (ch[i] == 'O')|| (ch[i] == 'U')|| (ch[i] == 'a')|| (ch[i] == 'e')||(ch[i] == 'i')|| (ch[i] == 'o')|| (ch[i] == 'u'))
      { continue;
      }
         else
         cout<<ch[i];
    }
}

int main()
{
    char ch[100];
    scanf("%s",ch);
    consonants(ch);
    return 0;
}


