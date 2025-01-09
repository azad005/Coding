
#Sets are used to store multiple items in a single variable.

#Set is one of 4 built-in data structures in Python used to store collections of data

#A set is a collection which is unordered, unchangeable*, and un-indexed.

#Sets are unordered, so you cannot be sure in which order the items will appear.

#Once a set is created, you cannot change its items, but you can remove items and add new items.
#So, Sets are Mutable due to adding new values and removing existing.
#Duplicate values will be ignored.




thisset = {"apple", "banana", "cherry"}
print(thisset)

thisset = {"apple", "banana", "cherry", "apple"}

print("with duplicates: ",thisset)

thisset = {"apple", "banana", "cherry", True, 1, 2}     #True and 1 is considered the same value, similarly False and 0

print(thisset)


set1 = {"abc", 34, True, 40, "male"}
print(set1)
print(type(set1))
print(len(set1))

# set() constructor to make a set:

thisset = set(("apple", "banana", "cherry")) # note the double round-brackets
print(thisset)

for x in thisset:
  print("Element: ",x)

print("banana" in thisset)

#Operations

#Once a set is created, you cannot change its items, but you can add new items.
#To add one item to a set use the add() method.


thisset = {"apple", "banana", "cherry"}

thisset.add("orange")

print("After add()= ",thisset)

thisset = {"apple", "banana", "cherry"}
newSet = {"pineapple", "mango", "papaya"}

thisset.update(newSet)

print("Updation in set: ",thisset)

thisset.remove("banana")
print("after remove: ",thisset)


#thisset.remove("banana")    #if item not found then error will be thrown so use discard() in place of it
#print("after remove: ",thisset)

thisset.discard("papaya")
print("after discard= ",thisset)

thisset.discard("papaya")   #no error if item does not exist
print("after discard= ",thisset)


#Sets are unordered, so when using the pop() method, you do not know which item that gets removed.
x = thisset.pop()
print("Popped element= ",x)
print("pop operation:", thisset)


del thisset
#print(thisset)
