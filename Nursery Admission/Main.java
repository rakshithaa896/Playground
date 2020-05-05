#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   char st[100];
  int count=0;
  cin>>st;
  for(int i=0;st[i]!='\0';i++)
    count+=1;
  cout<<"The number of letters in the name is "<<count;
}