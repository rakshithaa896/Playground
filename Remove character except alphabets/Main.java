#include<iostream>
using namespace std;
int main()
{
  string st;
  cin>>st;
  int n=st.length();
  for(int i=0;i<n;i++)
  {
    if((st[i]>='a' && st[i]<='z') || (st[i]>='A' && st[i]<='Z'))
      cout<<st[i];
  }                                                                     
}