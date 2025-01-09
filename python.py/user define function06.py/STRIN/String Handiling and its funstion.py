'''
#CREATING EMPTY STRING
s1=""
print(s1,type(s1))
s2=str()
print(s2,type(s2))

z="Azad Alam"
print("Length=",len(z))
#LENGTH OF STR
'''
'''
#INDEXING
z= "Md Azad Alam"
print("first char:",z[0])
print("last char:",z[-1])
#print("out of index:",z[20])
#INDEX ERROR DUE TO OUT OF INDEX
print("specific char:",z[2],[-4])

'''
'''
# slicing
z="Azad Alam"
print("sub-string: ", z[2:5])  # extract string, gives sub-string, 5 is excluded, 2 is included as index
print(z[:4])
print(z[:-4])

print(z[3:])
print(z[-3:])

print(z[::2])
print(z[::-1])
print(z[::])

'''
'''
# Operations on String
# Strings are objects that are immutable means once created, they cannot be changed.

a = "Azad"
b = "Alam"
print(id(a), " and", id(b))
#a[1]='i'   #TypeError as item assignment not allowed
c = a + b
print("id after concat: ", id(c))
print("Concat using + op: ", c)
print("concat using join method: ", a.join([a, b]))

print("Repeat of string: ", b * 4)
'''
'''

# Methods available on Strings
z = "Md Azad Alam is a name"

print("Length = ", len(z))  # length of str
print("Uppercase = ", z.upper())
print("Lowercase = ", z.lower())
print("Capitalize = ", z.capitalize())
print("Title = ", z.title())
print("Count a char: ", z.count('e'))
print("Find: ", z.find("ad"))
print("Find: ", z.find("Ad"))
print("Start with: ", z.startswith("Md"))
print("End with: ", z.endswith("name"))

print("After replacment = ", z.replace("e", "i"))
print("Spliting = ", z.split(" "))
z = "    Md Azad Alam is a name           "
print("before strip: ",z)
print("Whitespace removed =", z.strip())  # removes whitespace from string left and right both sides

z = "PA123Azad"
print("Is Digits: ", z.isdigit())
print("Is alphabets: ", z.isalpha())
print("Is alphanumerics, mix:", z.isalnum())
'''
'''
#FIND VOWEL AND THEIR  COUNT
def Check_Vow(string, vowels):
	final = [each for each in string if each in vowels]
	print(len(final))
	print(final)

string = "Md Azad Alam"
vowels = "AaEeIiOoUu"
Check_Vow(string, vowels);
'''
'''
#WEATHER A STRING IS PALINDROME

a = input("Enter a word:")

reversed = a[::-1]

if a== reversed:
    print("It is Palindrome")
else:
    print("It is Not Palindrome")
    
    '''
'''    
ef factorial(n): 
     
    if (n==1 or n==0):
          return 1
    else:
         return (n * factorial(n - 1)) 
    
num = 5; 
print("number : ",num)
print("Factorial : ",factorial(num))
'''