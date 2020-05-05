#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c;
  cin>>r>>c;
  int a[r][c],b[r][c],cd[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>b[i][j];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cd[i][j]=a[i][j]+b[i][j];
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<c;j++)
      cout<<cd[i][j]<<" ";
    cout<<"\n";
  }
}