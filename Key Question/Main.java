k=input()
m=list(k)
l=[]
for i in m:
  l.append(int(i))
l=sorted(l)
for i in l:
  print(i,end=" ")