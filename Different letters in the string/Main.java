a=input()
b=input()
j=0
if(a==b):
  print('NA')
for i in range(len(a)):
  try:
    if(a[i]==b[j]):
      j=j+1
    else:
      print(a[i],end='')
  except:
    print(a[i],end='')
