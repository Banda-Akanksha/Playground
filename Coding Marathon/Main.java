a=int (input())
b=int(input ())
c=input ()
k=c.split ()
s=[]
for i in k:
  s.append(int(i))
l=sorted(s)
sum=0
for i in range(1,b+1):
  sum+=l[-i]
print(sum)
  