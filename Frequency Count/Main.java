a=input ()
d={}
for i in a:
  if i not in d:
    d[i]=0
  d[i]+=1
k=sorted(d.keys())
for i in k:
  print(i,end="")
  print(d[i],end="")