#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   string st;
  int vo=0,con=0,dig=0,ws=0,sym=0;
  getline(cin,st);
  for(int i=0;st[i]!='\0';i++)
  {
    if ((st[i]>='a'&&st[i]<='z')||(st[i]>='A'&&st[i]<='Z'))
    {
      if (st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u'||st[i]=='A'||st[i]=='E'||st[i]=='I'||st[i]=='O'||st[i]=='U')
        vo+=1;
        else
          con+=1;
    }
    else if (st[i]==' ')
      ws+=1;
    else if (st[i]=='0'||st[i]=='1'||st[i]=='2'||st[i]=='3'||st[i]=='4'||st[i]=='5'||st[i]=='6'||st[i]=='7'||st[i]=='8'||st[i]=='9')
      dig+=1;
    else
      sym+=1;
  }
  cout<<"Vowels:"<<vo;
  cout<<"\nConsonants:"<<con;
  cout<<"\nWhite Spaces:"<<ws;
  cout<<"\nDigits:"<<dig;
  cout<<"\nSymbols:"<<sym;
}