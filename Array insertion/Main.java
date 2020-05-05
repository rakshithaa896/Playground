#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,pos,x;
  cin>>n;
  int a[n+1];
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>pos;
  cin>>x;
  n+=1;
  for(int i=n;i>=pos;i--)
    a[i]=a[i-1];
  a[pos-1]=x;
  if(pos>n)
  {
    cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\n";
    cout<<"Invalid Input";
  }
  else
  {
    cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\nEnter the value to insert\nArray after insertion is\n";
   for(int i=0;i<n;i++)
     cout<<a[i]<<"\n";
  } 
}