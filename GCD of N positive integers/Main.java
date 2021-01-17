a=int (input ())
b=input ()
c=b.split ()
k =[]
for i in c:
  k.append(int(i))
s=sorted(k)
for i in range(s[-1],0,-1):
  co=0
  for j in s:
    if(j%i==0):
      co+=1
  if(co==a):
    print(i)
    break
    