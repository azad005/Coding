'''
number = int(input("Enter the integer number: "))  
  
revs_number = 0  
  
while (number > 0):  
    remainder = number % 10  
    revs_number = (revs_number * 10) + remainder  
    number = number // 10  
  
print("The reverse number is :",revs_number) 
'''

# Define a 2D matrix (list of lists)
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

# Display the matrix
print("2D Matrix:")
for row in matrix:
    for element in row:
        print(element, end=" ")
    print()  # Move to the next line for the next row