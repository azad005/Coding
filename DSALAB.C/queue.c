#include <stdio.h>
#define MAX_SIZE 5

int queue[MAX_SIZE]; 
int front = -1; 
int rear = -1;

int enqueue(int item) 
{ 
    if (rear == MAX_SIZE - 1) // Check if the queue is full
    { 
        printf("Queue Overflow\n"); 
        return 0; 
    } 
    else 
    { 
        if (front == -1) 
        { 
            front = 0; 
        } 
        rear = rear + 1; // Increment rear
        queue[rear] = item; 
        printf("Item Enqueued: %d\n", item); 
    }
    return 1; 
} 

int dequeue()  
{ 
    if (front == -1 || front > rear) // Check if the queue is empty
    { 
        printf("Queue Underflow\n"); 
        return -1; 
    } 
    int item = queue[front]; 
    if (front == rear) // Reset queue when the last element is dequeued
    { 
        front = -1; 
        rear = -1; 
    } 
    else 
    { 
        front = front + 1; // Increment front
    } 
    return item; 
}

void display()  
{ 
    if (front == -1) 
    { 
        printf("Queue is empty\n"); 
        return; 
    } 
    printf("Items in Queue are: \n"); 
    for (int i = front; i <= rear; i++) 
    { 
        printf("%d  ", queue[i]); 
    } 
    printf("\n"); 
} 

int main() 
{ 
    enqueue(45); 
    enqueue(25); 
    enqueue(91); 
    display(); 

    printf("Dequeued item: %d\n", dequeue()); 
    display(); 

    enqueue(34); 
    enqueue(52); 
    display(); 

    printf("Dequeued item: %d\n", dequeue()); 
    display(); 

    return 0; 
}
