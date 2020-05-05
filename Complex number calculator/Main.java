#include<iostream>
using namespace std;
struct comple
{
  int n,a,b,c,d,real,comp;
};
int main()
{
  struct comple cm;
  cin>>cm.n>>cm.a>>cm.b>>cm.c>>cm.d;
  if (cm.n==1)
  {
    cm.real=cm.a+cm.c;
    cm.comp=cm.b+cm.d;
    if (cm.comp>0)
      cout<<cm.real<<"+"<<cm.comp<<"i";
    else
      cout<<cm.real<<cm.comp<<"i";
  }
  else if (cm.n==2)
  {
    cm.real=cm.a-cm.c;
    cm.comp=cm.b-cm.d;
    if (cm.comp>0)
      cout<<cm.real<<"+"<<cm.comp<<"i";
    else
      cout<<cm.real<<cm.comp<<"i";
  }
  else if (cm.n==3)
  {
    cm.real=(cm.a*cm.c)-(cm.b*cm.d);
    cm.comp=(cm.a*cm.d)+(cm.b*cm.c);
        if (cm.comp>0)
      cout<<cm.real<<"+"<<cm.comp<<"i";
    else
      cout<<cm.real<<cm.comp<<"i";
  }
  else
    cout<<"Invalid choice";
}