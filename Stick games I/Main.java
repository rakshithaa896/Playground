#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,k,a[100][100],od=0,ev=0,n,m;
cin>>m>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(i==k)
      {
        if(od<=ev)
          od+=1;
        else if(od>ev)
          ev+=1;
      }
    }
  }
  if(od>ev)
    cout<<"Arun Gupta";
  else if(od<=ev)
    cout<<"Mani Iyer";
}