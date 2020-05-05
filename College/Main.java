#include<iostream>
#include<string>
using namespace std;
#define max 100
struct college
{
  string name;
  string city;
  int y;
  float per;
}col[max];
int main()
{
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<"\nEnter the details of college "<<i;
    cout<<"\nEnter name";
    cin>>col[i].name;
    cout<<"\nEnter city";
    cin>>col[i].city;
    cout<<"\nEnter year of establishment";
    cin>>col[i].y;
    cout<<"\nEnter pass percentage";
    cin>>col[i].per;
  }
  cout<<"\nDetails of colleges";
  for(int i=1;i<=n;i++)
  {
    cout<<"\nCollege:"<<i;
    cout<<"\nName:";
      cout<<col[i].name;
    cout<<"\nCity:"<<col[i].city;
    cout<<"\nYear of establishment:"<<col[i].y;
    cout<<"\nPass percentage:"<<col[i].per;
  }
}