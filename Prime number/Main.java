k=int(input())
for i in range(2,k):
  c=0
  for j in range(1,i):
    if(i%j==0):
      c+=1
  if(c==1):
    print(i,end=" ")
    