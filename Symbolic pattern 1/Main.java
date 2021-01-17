k=int(input())
for i in range(1,k+1):
    for j in range(1,k+1):
        if i==(k//2)+1 or j==(k//2 )+1 :
            print("*",end='')
        else:
            print(" ",end='')
    print()
