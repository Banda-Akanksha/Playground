#include <iostream>
using namespace std;
int main()
{
  int a,b,i,j,s;
  cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    s=0;
    for(j=1;j <i;j++)
    {
      if (i%j==0)
      {
        s+=j;
      }
    }
    if(s==i)
   
    {
      cout<<s<<" ";
    }
  }
}