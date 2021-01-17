a=int (input ())
b=input ()
c=b.split()
k=[]
for i in c:
  k.append (int (i))
s=sorted(k)
mul=s[-1]+s[-2]
print(mul)
  