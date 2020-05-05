#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
   int count=0;
   char ch[100];
   std::cin.getline(ch,100);
   for(int i=0;i<strlen(ch);i++)
   {
     if (ch[i]==' ')
       count+=1;
   }
   if (count<10)
     std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
  
   
   
}