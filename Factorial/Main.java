#include<iostream>
using namespace std;
int main()
{
  int n,c=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    c=c*i;
  }
  cout<<"The factorial of "<<n<<" is "<<c;
}