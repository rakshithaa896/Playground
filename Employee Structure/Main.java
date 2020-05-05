#include<iostream>
using namespace std;
struct employe
{
  char st[100],desi[100];
  int id,age;
  float salary;
};
int main()
{
  employe emp;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details\n";
  cin.getline(emp.st,100);
  cin>>emp.id>>emp.age;
  cin>>emp.desi;
  cin>>emp.salary;
  cout<<"Name of the Employee : "<<emp.st<<"\nID of the Employee : "<<emp.id<<"\nAge of the Employee : "<<emp.age;
  cout<<"\nDesignation of the Employee : "<<emp.desi<<"\nSalary of the Employee : "<<emp.salary;
}