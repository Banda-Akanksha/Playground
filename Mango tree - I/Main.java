#include<iostream>
using namespace std;
int main()
{
  int r,c,n,x;
  std::cin>>r>>c>>n;
  if(n==(2*c)+1)
    cout <<"Yes";
  else if((n>=1 && n<=c) || (n>r*(c-1) && n<=r*c))
    std::cout<<"Yes";
  else
    std::cout<<"No";   
}