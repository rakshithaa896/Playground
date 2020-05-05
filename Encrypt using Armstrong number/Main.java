#include<iostream>
#include<bits/stdc++.h>
int main()
{
  int n,a,c=0,s=0;
  std::cin>>n;
  a=n;
  while(a>0)
  {
    c++;
    a=a/10;
  }
  a=n;
  while(a>0)
  {
    s=s+pow(a%10,c);
    a=a/10;
  }
  if(s==n)
    std::cout<<"Kindly proceed with encrypting";
   else
     std::cout<<"It is not an Armstrong number";
}
     