#include<iostream>
using namespace std;
int fun(int n,int *a)
{
  int odd=0,even=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      even+=1;
    else
      odd+=1;
  }
  if (even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
int main()
{
  int n,m;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  int k=fun(n,a);
  if (k==1)
    cout<<"The array is Even";
  else if (k==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  
}