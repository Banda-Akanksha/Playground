#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,z,hcf,k;
  std::cin>>a>>b>>c;
  x=a;
  y=b;
  z=c;
  if(a>=b && a>=c)
  {
    if(b>=c)
    {
      std::cout<<"The treasure is in box which has number "<<b<<"\n";
      k=c;
    }
    else
    {
     k=b;
     std::cout<<"The treasure is in box which has number "<<c<<"\n";
    }
  }
  else if(b>=a && b>=c)
  {
    if(a>=c)
    {
      std::cout<<"The treasure is in box which has number "<<a<<"\n";
      k=c;
    }
    else
    {
      std::cout<<"The treasure is in box which has number "<<c<<"\n";
      k=a;
    }
  }
  else if(a>=b)
  {
    std::cout<<"The treasure is in box which has number "<<a<<"\n";
    k=b;
  }
  else
  {
    std::cout<<"The treasure is in box which has number "<<b<<"\n";
    k=a;
  }
  for(hcf=k;hcf>=1;hcf--)
  {
    if(a%hcf==0 && b%hcf==0 && c%hcf==0)
      break;
  }
  std::cout<<"The code to open the box is "<<hcf;
}