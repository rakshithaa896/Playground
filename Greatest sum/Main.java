#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int r,c;
  cin>>r>>c;
  int a[r][c],i,j,col=0,row=0,mr=-99999,mc=-99999;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
   int sum=0;
   for(j=0;j<c;j++)
     sum+=a[i][j];
   cout<<sum<<" ";
   if (sum>mr)
   {
     mr=sum;
     row=i;
   }
  }
  cout<<"\nRow "<<row+1<<" has maximum sum\n";
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
  {
    int sum=0;
    for(j=0;j<r;j++)
      sum+=a[j][i];
    cout<<sum<<" ";
    if (sum>mc)
    {
      mc=sum;
      col=i;
    }
  }
  cout<<"\nColumn "<<col+1<<" has maximum sum";
  
}