'''
# LOCAL VARIABLE
def greet():
    message="Hello"
    print("Local", message)
greet()
print(message)
'''
#GLOBAL VARIABLE
message="Hello"
def greet():
    print("Local",message)
greet()
print("Global",message)    