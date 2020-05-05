#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j;
  cin>>n;
  int a[n][n],k=true,l=0;
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  int sum=0,sum1=0;
  for(i=0;i<n;i++)
    sum+=a[i][i];
  for(i=0;i<n;i++)
    sum1+=a[i][n-i-1];
  if (sum==sum1)
  {
    for(i=0;i<n;i++)
    {
    int rowsum=0;
    for(j=0;j<n;j++)
      rowsum+=a[i][j];
    if (rowsum!=sum)
    {
      l=1;
      k=false;
      break;
    }
  }
  if (l==0)
  {
    for(i=0;i<n;i++)
    {
      int colsum=0;
      for(j=0;j<n;j++)
        colsum+=a[j][i];
      if (colsum!=sum)
      {
        k=false;
        break;
      }
    }
  }
}
else
  k=false;
if (k)
  cout<<"Yes";
else
  cout<<"No";
  
}