#include<iostream>
int main()
{
  // Type your code here
  int n,i,m,k=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cin>>m;
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      k=1;
      std::cout<<"She passed her exam";
      break;
    }
  }
  if(k==0)
    std::cout<<"She failed";
}