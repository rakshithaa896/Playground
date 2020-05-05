
#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  cin>>n;
  while(n>9)
  {
    int a=0;
    while(n>0)
    {
a=a+n%10;
      n=n/10;
    }
    n=a;
  }
  cout<<n;
}