#include<iostream>
#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  string st,st1;
  getline(cin,st);
  getline(cin,st1);
  int l=st.length();
  int n=l-1;
  for(int i=0;i<l/2;i++)
  {
    swap(st[i],st[n]);
    n=n-1;
  }
  if(st==st1)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  
  
}