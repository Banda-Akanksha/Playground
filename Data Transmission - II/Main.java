k=input()
m=k [::-1]
c=0
for i in range(len(k)):
  if(k[i]==m[i]):
    c+=1
print(c)