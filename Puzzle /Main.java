#include<iostream>
int main()
{
    // Type your code here
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c],b[c][r];
  for(i=0;i<r;i++)
   for(j=0;j<c;j++)
     std::cin>>a[i][j];
  for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      b[j][i]=a[i][j];
      std::cout<<b[j][i]<<" ";
    }
    std::cout<<"\n";
  } 
}