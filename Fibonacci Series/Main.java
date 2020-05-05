#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,i,n,c;
  cin>>n;
  for(i=3;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<c;
}