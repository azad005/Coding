import matplotlib.pyplot as plt

# Data
x = [1, 2, 3, 4]
y = [43, 96, 141, 138]

# Create a line graph
plt.plot(x, y, marker='o')

# Display the numbers on the line
for i, value in enumerate(y):
    plt.text(x[i], value, str(value), ha='center', va='bottom')

# Labels and title
plt.xlabel('Index')
plt.ylabel('Value')
plt.title('Line Graph with Numbers on the Line')

# Show the graph
plt.show()
