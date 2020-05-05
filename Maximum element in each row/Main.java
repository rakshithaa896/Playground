#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c;
  cin>>r>>c;
  int a[r][c],i,j;
  for(i=0;i<r;i++)
  {
    int m=-999;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>m)
        m=a[i][j];
    }
    cout<<m<<"\n";
  }  
}