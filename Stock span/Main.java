#include<iostream>
using namespace std;
int main()
{
  int a[100],b=2,i,n;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"1"<<"\n";
  for(i=1;i<n;i++)
  {
    if(a[i]>a[i-1])
    {
      cout<<b<<"\n";
      b+=2;
    }
    else
    {
      cout<<'1'<<"\n";
    }
  }
}
