 # List is built-in data structures (others like: tuple, set, dictionaries)
# List is collection of ordered elements, so its a collection too.
# List is mutable means elements can be added, deleted or modified.
# List can contain heterogeneous data types of dynamic size.
'''
# Empty list
l1 = []
print(l1, type(l1))
l2 = list()
print(l2, type(l2))

# Mixed type of data
mixed = [10, True, 10 + 4j, "Azad", 3.14]
print(mixed)
print(type(mixed))
print("Length= ", len(mixed))


# Indexing
num = [1, 2, 3, 4, 5, 6, 7]
print(num)

print("First element: ", num[0])
print("Last element: ", num[-1])
print("3rd element: ", num[2])

# Slicing: extracting a sub-sequence of a list
print("List Slicing...")
print(num[:4])
print(num[:-4])
print(num[2:4])
print(num[4:])
print(num[-4:])
print(num[::])
print(num[::2])
print(num[::-1])


# Nested List: an element of a list can be another list
num=[1,3,4,5,6,]
nested = [num, "Nested", 101, "Alam"]
print(nested)

# nested list indexing and slicing
print(nested[0])
print(nested[3])
print(nested[0][3])

# Methods and Operations on List
lst = [1, 2, 3]
print(lst)

lst.append(100)  # insert single element to last position in existing
print(lst)

lst.insert(1, 55)
print(lst)

lst[0] = "Hello"
print(lst)

lst.extend(["A", "B", "C"])
print(lst)

print(lst + num)  # list concatenation
print(num*3)
 

# List is Mutable: Proof
lst = [2, 4, 6, 8, 10]
print("Original lst: ", lst)
print(id(lst))

lst[len(lst) - 1] = 12  # list is mutable so it works well
print("Modified lst: ", lst)
print(id(lst))

print("Min ", min(lst))
print("Max ", max(lst))
print("Sum ", sum(lst))

# deletion
lst=[3,2,5,100,22,4,6,20]
print("Before Deletion: ", lst)
lst.remove(6)  # delete first occurence of the given element from the list and returned modified list
print("after remove: ", lst)
lst.pop()  # deletes last element if index not given, returns deleted element
print("After pop: ", lst)
x=lst.pop(2)  # delete element specified by index
print("After pop indexed: ", lst, "deleted element returned= ",x)

# del does not return deleted element unlike pop() gives
del lst[1]
print(lst)

# clear() removes all elements but list object exist
lst.clear()
print("after clear method: ", lst)

print(num)
del num
#print(num)

'''
# Sorting

lst=[4,1,3,2,5]
print("Before Sorting lst= ",lst)
print("Sorted lst= ", sorted(lst))
print("Sorted reverse order: ", sorted(lst, reverse=True))
print("list after sorted() is not changed: ", lst)

lst=[4,1,3,2,5]
lst.sort()
print("sort original list as: ", lst)
lst.sort(reverse=True)
print("sort after reverse: ", lst)

lst.reverse()
print("after reverse() now: ", lst)



# Cloning/List/Aliasing reference  concept
lst = [3, 4, 1, 5, 2]
print("lst: ", lst)

lstCopy = list(lst) #new copied list

lstMore = lst       #reference copy/aliasing

lstCopy.append("111")
print("After append lstCopy=", lstCopy)
print("original lst=", lst)

print("Is both Lists are same after copy()? ", lstCopy is lst)
print("Is both Lists are same after equals? ", lstMore is lst)


# Fetching item in sequence using for loop: iterating objects
lst = [3, 4, 1, 5, 2]
print(lst)
for i in lst:
    print("Item = ", i)

# Linear searching in List using in operator used with list
lst=[3, 4, 1, 5, 2, 'Azad', 'Alam']
var = input("Enter your search element: ")
if var in lst:
    print("Yes, item is present")
else:
    print("Not found!!!")

# Linear searching in List by individual elements via iteration
lst = [2, 4, 6, 8, 10]
print("lst elements are: ",lst)
var = int(input("Enter your search element: "))
flag=0
for i in lst:
    if i == var:
        print("Yes, item is present")
        flag=1
        break
if flag==0: print("Element Not Found!!!")

 # Linear searching with mixed data types

lst=[3, 4, 1, 5, 2, 'Azad', 'Alam',3.14]
print(lst)

var = eval(input("Enter your search element: "))
if var in lst:
    print("Yes, item is present")
else:
    print("Not found!!!")
m