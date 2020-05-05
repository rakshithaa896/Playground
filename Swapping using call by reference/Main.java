#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int swap(int *x,int *y)
{
  int t;
t=*x;
*x=*y;
*y=t;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(&a,&b);
  cout<<"After swapping a= "<<a<<" and b="<<b;
}

  