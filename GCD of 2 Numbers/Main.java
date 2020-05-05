#include<iostream>
using namespace std;
int main()
{
  int m,n,r,a,b;
  cin>>m>>n;
  a=m;
  b=n;
  while(n!=0)
  {
    r=m%n;
    m=n;
    n=r;
  }
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<m;
  
}