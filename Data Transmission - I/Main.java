import math
k=input()
l=k[::-1]
bi=int(l)
li=list(l)
sol=0
for i in range(len(li)):
  sol+=int(li[i])*(pow(2,i))
print(sol)