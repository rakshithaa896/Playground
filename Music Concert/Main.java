#include<iostream>
int main(){
  // Type your code here
  int m,*a,od=0,ev=0;
  std::cin>>m;
  a=(int *)malloc(m*sizeof(int));
  for(int i=0;i<m;i++)
  {
    std::cin>>*(a+i);
    if(*(a+i)%2==0)
     ev+=1;
    else
     od+=1;
  }
       std::cout<<od<<"\n"<<ev;
  return 0;
}