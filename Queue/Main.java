#include<iostream>
using namespace std;
void queue(int,int,int*);
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
}
void queue(int n,int m,int *a)
{
  int count=0;
  for(int i=0;i<n;i++)
  {
    if(i==0)
      count+=1;
    else if(a[i]==m)
      count+=1;
    else if(a[i]+a[i+1]<=m && i!=n-1)
    {
      count+=1;
      i+=1;
    }
    else if (a[i]<m)
      count+=1;
  }
  cout<<count;
}