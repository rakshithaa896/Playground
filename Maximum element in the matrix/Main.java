#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,m=-99999;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if (a[i][j]>m)
        m=a[i][j];
    }
  }
  cout<<"The maximum element is "<<m;

}