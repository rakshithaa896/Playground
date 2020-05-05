#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string st,st1;
  cin>>st;
  cout<<st;
  int n=st.length();
  char ch=st[n-1];
  while(cin>>st1)
  {
    if (ch==st1[0])
    {
      cout<<"\n";
      cout<<st1;
    }
    n=st1.length();
    ch=st1[n-1];
  }  
}