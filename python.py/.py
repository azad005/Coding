import numpy as np
import matplotlib.pyplot as plt

# Sample data based on the user's array and comparison count
input_size = 9
comparisons = 265

# Generate data points for typical O(n log n) growth for various input sizes
input_sizes = np.arange(1, 21)  # Input sizes from 1 to 20
time_complexity_values = input_sizes * np.log2(input_sizes)

# Normalize the time complexity to fit the comparison data
scaling_factor = comparisons / (input_size * np.log2(input_size))
scaled_time_complexity = time_complexity_values * scaling_factor

# Plot the graph
plt.figure(figsize=(10, 6))
plt.plot(input_sizes, scaled_time_complexity, label='O(n log n) Time Complexity', color='blue', linewidth=2)
plt.scatter([input_size], [comparisons], color='red', label=f'User Data Point (n={input_size}, comparisons={comparisons})')

# Add labels and title
plt.title('Time Complexity of Merge Sort (O(n log n))', fontsize=14)
plt.xlabel('Input Size (n)', fontsize=12)
plt.ylabel('Number of Comparisons', fontsize=12)
plt.legend()
plt.grid(True)
plt.tight_layout()

# Show the graph
plt.show()
