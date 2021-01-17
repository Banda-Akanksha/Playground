#include<iostream>
using namespace std;
int main()
{
  int i=0,n=1,a[3];
  float s=0.0;
  while(i<3)
  {
    cin>>n;
    if(n <0)
    {
      s=s-1.0;
      break;
    }
    else if(n%2==0)
    {
      s=s-0.5;
    }
    else
    {
      s=s+1.0;
      i++;
    }
  }
    cout<<s;
  }