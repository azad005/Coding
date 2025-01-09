#Tuple Experiment no 09

# Like List, Tuple is a collection or Data structure.
#Both List and Tuple can contain duplicate values.
#Like List, Tuple can contain dissimilar data elements.
#Yes, it is ordered via Indexing (0 to n-1).
#Unlike List, Tuple is Immutable or unchangeable(you can't add, change or remove any element).
#Tuples are written with round brackets (parenthsis) , remember [ ] in list.


tpl=("India","England","India","Australia","India","NZ","India","WI")
print("Tuple= ",tpl)
print(type(tpl))

#Accessing tuples by indexing
print("Value at index is =", tpl[3])
print("Length= ",len(tpl))

#tuple are ordered so indexing and slicing is same as List have (even Str)

#Is Tuple Mutable? NO, they are Immutable

'''
tpl[1]="England"
print(tpl)
'''
#Operations on Tuple
tpl2=(5,7,5)
tpl3=tpl+tpl2
print("concat of tuples using + is: ",tpl3)

print("* of tuples: ",tpl2*3)


#Functions on Tuples
print("tpl is: ",tpl)
print("Sorted: ",sorted(tpl))   #no sort() only sorted() available for tuple
print("Sorted reverse: ",sorted(tpl,reverse=True))

print("tpl2 is: ",tpl2)
print("Count= ",tpl2.count(5))
tplNew=(5,7,5,7,3,7)
print("Index= ",tplNew.index(7))    # #fetch loc/index at first occurence only!!!

#tplnew=reversed(tpl)
#print(tplnew)

print("length: ", len(tpl3))
print(min(tpl2))
print(max(tpl2))
print(sum(tpl2))

#any() vs. all()
#any returns true if any one of its element is True.
#all returns true only if all of elements are True/Non-blank

t=(10,False,"Tuple","")
print("any= ",any(t))
print("all= ",all(t))


#Iterating tuple using for loop
for i in tpl:
    print("Item=",i)

#Searching item from a tuple using membership op: in
if "India" in tpl:
    print("India is present in tuple")





#Conversion from list to tuple & tuple to list for operations

tpl=(2,4,1,5,3)
print("tpl= ",tpl)

lst=list(tpl)
lst[0]=6
print("tuple becomes list with modification: ", lst)

tpl=tuple(lst)
print("List becomes tuple: ", tpl)
