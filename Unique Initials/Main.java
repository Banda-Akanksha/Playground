str=input()
count=[0]*256
for i in range(len(str)):
    count[ord(str[i])]+=1
c=int(0)
for i in range(256):
    if(count[i]==1):
        c+=1
print(c)