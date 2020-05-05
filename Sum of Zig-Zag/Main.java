#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c;
  cin>>r>>c;
  int a[r][c],i,j;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  int sum=0;
  for(j=0;j<c;j++)
    sum+=a[0][j];
  for(j=0;j<c;j++)
    sum+=a[r-1][j];
  for(i=1;i<r-1;i++)
    sum+=a[i][c-i-1];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}