#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int m,n,r,a;
  cin>>m>>n>>r;
  a=pow(m,n);
  if(a>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}