#include<iostream>
int main()
{
  // Type your code here
   int n,i,max;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  max=a[0];
  for(i=1;i<n;i++)
  {
    if (a[i]>max)
      max=a[i];
  }
  std::cout<<max;
}