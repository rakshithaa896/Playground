#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int k=printresult(a,n,m);
  if (k>=0)
    cout<<"YES";
  else
    cout<<"NO";
}
int printresult(int *a,int n,int m)
{
  for(int i=0;i<n;i++)
  {
    m=m-a[i];
  }
  return m;
  
}
