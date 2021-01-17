im=int(input())
k=input()
mo=[]
mo=k.split() 
b=input()
l=[]
l=b.split()
c=0
for i in range(int(im)):
  if(int(l[0])%int(mo[i])==0 and int(l[1])%int(mo[i])==0):
    c+=1
print(c)