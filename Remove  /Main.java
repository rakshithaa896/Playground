#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
  int i,j=0,k=0;
  char str[100],str1[100][200],word[4]="the";
  gets(str);
  for(i=0;str[i]!='\0';i++)
  {
    if (str[i]==' ')
    {
      str1[k][j]='\0';
      k++;
      j=0;
    }
    else
    {
      str1[k][j]=str[i];
      j++;
    }
  }
  for (i=0;i<k+1;i++)
  {
    if (strcmp(str1[i], word)==0)
    {
      for (j=i;j<k+1;j++)
      {
        strcpy(str1[j],str1[j+1]);
      }
    }
  }
  for (i=0;i<k+1;i++)
  {
    cout<<str1[i]<<" ";
  }
  return 0;
  
}