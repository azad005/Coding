'''
#Dictionary and its operations
 #Dictionary:used to store data values in key:value pairs.

#1. Collection/DS which is Unordered (upto ver 3.6),
2. But, Ver 3.7 onwards Dictionary is Ordered, in sequence.
#3. Changeable means its Mutable.
#4. Ordered via key.
#5. Ignore duplicates, latest will be used.

'''

thisdict={'speed':150,"brand": "Honda","model": "Amaze","year": 2017,'Cylinder':4 }


print("Entire Dictionary is= ",thisdict)

x = thisdict["model"]
print("Value from indexing= ",x)

x = thisdict.get("model")
print("Value using get()=  ",x)

#x = thisdict["address"]
#print("Value from indexing= ",x)

x = thisdict.get("address")
print("Value using get()=  ",x)

thisdict["year"] = 2024
print("After updation, Dictionary is=  ",thisdict)

print("Length of Dictionary is= ",len(thisdict))

thisdict = {'name': 'AZAD ALAM', 1: [2, 4, 3]}
print("Key as List= ",thisdict)



#Fetching keys and their values

for x in thisdict:
  print("Key is: ",x)

for x in thisdict:
  print("Value by indexing with key: ",thisdict[x])

for x, y in thisdict.items():
  print("Key-Value: ",x, y)



#Searching through Key
print(thisdict)

search='model'
if search in thisdict:
  print("Yes, Found= ", search)
else:
  print("Not Found= ", search)

search='Honda'
if search in thisdict:
   print("Yes Found= ", search)
else:
  print("Not Found= ", search)

  
#search using element in Dictionary
thisdict = {'Brand': 'TATA', 'Year': '2007', 'Speed': '200'}

if "Speed" in thisdict:
    print("Element exists in the dictionary")
else:
    print("Element does not exist in the dictionary")


#Mutation in Dictionary

print(thisdict)
thisdict["color"] = "light gray"
thisdict['model']='City'
print("After updation= ",thisdict)

#Duplicate Keys are ignored, latest key value will be used
d={"a":1,"b":20,"c":3,"a":10}
print("Duplicate key ignored= ",d)


#Deletion on Dictionary

print(thisdict)
thisdict.pop("model")
print("After pop()= ", thisdict)

thisdict.popitem()
print("After popitem(): ",thisdict)


#Copying,Clearing and Removal


my= thisdict.copy()
print("my= ",my)
print(type(my))
print("str= ",str(my))


my.clear()
print("After clear()= ", my)

del(my)
#print(my)
