'''
a=20
b=10
print(a==b)

a=20
b=10
print(a!=b)

a=20
b=5
print(a<b)

a=20
b=5
print(a!=b)

a=20
b=5
print(a>=b)

a=20
b=5
print(a<b)





a=20
b=10
c=a=b
print(c)

a=20
b=10
c=a+b
print(c)

a=20
b=5
c=a/b
print(c)

a=20
b=5
c=a=a/b
print(c)




a=20
b=5
c=a&b
print(c)

a=20
b=5
c=a|b
print(c)

a=20
b=5
c=a^b
print(c)

a=20
b=5
print(~a)

a=20
b=5
c=a<<b
print(c)

a=20
b=5
c=a>>b
print(c)




a=20
b=5
print(a>b and a>24)

a=20
b=5
print(a>b or a>24)

a=20
b=5
print(not(a>b))





s= "pryanshu"
print("pr" in s)
 
s= "pryanshu"
print("t" not in s)



a=20
b=20
c=3
print(a is b)

a=20
b=20
c=3
print(b is c)
print(a is not b)
'''
'''
for i in range (1,6):
  print("1"*i)
'''
'''
n=5
for i in range(n+1):
    for j in range(1,i+1):
        print(j,end='')
    print()
'''
'''
for i in range(1,6):
  print('1'*(5-1),end='') 
  for j in range(1,i+1):
     print(j,end='')
  print()
  '''
def factorial(n): 
     
    if (n==1 or n==0):
          return 1
    else:
         return (n * factorial(n - 1)) 
    
num = 5; 
print("number : ",num)
print("Factorial : ",factorial(num))