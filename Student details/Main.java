#include<bits/stdc++.h>
using namespace std;
struct st
{
  int y;
  char name[100],d[100];
  float m;
}s[100];
int main()
{
  int n,i,j;
  cin>>n;
  st t;
  cout<<"Enter the number of students\n";
  for(i=0;i<n;i++)
     cin>>s[i].name>>s[i].d>>s[i].y>>s[i].m;
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name\nEnter department\nEnter year of study\nEnter cgpa\n";
  }
  cout<<"Details of students\n";
  for(i=0;i<n-1;i++)
  {
    if(strcmp(s[i].name,s[i+1].name)>0)
    {
      t=s[i];
      s[i]=s[i+1];
      s[i+1]=t;
    }
  }
  for(i=0;i<n;i++)
  {
    cout<<"Student "<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"Department:"<<s[i].d<<"\n";
    cout<<"Year of study:"<<s[i].y<<"\n";
    cout<<"CGPA:"<<s[i].m<<"\n";
  }
}
