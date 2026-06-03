# Arrays in Java 

## What is an Array?

An array is a linear data structure used to store multiple elements of the same data type in contiguous memory locations.

Instead of creating multiple variables, we can store all values inside a single array.

---

# Simple Definition

> An array is a collection of similar data elements stored in contiguous memory locations and accessed using an index.

---

# Why Do We Need Arrays?

Without arrays:

```java
int marks1 = 90;
int marks2 = 85;
int marks3 = 78;
int marks4 = 95;
```

With arrays:

```java
int[] marks = {90, 85, 78, 95};
```

Arrays help us:

✅ Store large amounts of data

✅ Access elements quickly

✅ Reduce code duplication

✅ Process data efficiently

---

# Characteristics of Arrays

- Fixed Size
- Same Data Type
- Contiguous Memory Allocation
- Index Based Access
- Fast Element Access

---

# Memory Representation

```text
Index:   0    1    2    3    4
Value:  10   20   30   40   50
```

---

# Array Declaration

```java
int[] arr;
```

or

```java
int arr[];
```

---

# Array Initialization

```java
int[] arr = new int[5];
```

---

# Declaration + Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

# Creating an Array

```java
class Demo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

    }
}
```

---

# Accessing Elements

```java
int[] arr = {10, 20, 30};

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
```

Output:

```text
10
20
30
```

---

# Updating Elements

```java
int[] arr = {10, 20, 30};

arr[1] = 100;

System.out.println(arr[1]);
```

Output:

```text
100
```

---

# Array Length

```java
int[] arr = {10, 20, 30};

System.out.println(arr.length);
```

Output:

```text
3
```

---

# Array Traversal

Traversal means visiting every element.

```java
int[] arr = {10, 20, 30, 40};

for(int i = 0; i < arr.length; i++) {

    System.out.println(arr[i]);

}
```

---

# Enhanced For Loop

```java
int[] arr = {10, 20, 30, 40};

for(int num : arr) {

    System.out.println(num);

}
```

---

# Types of Arrays

## 1. One Dimensional Array

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

## 2. Two Dimensional Array

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};
```

---

## 3. Multi-Dimensional Array

```java
int[][][] arr = new int[2][3][4];
```

---

# Two Dimensional Array

## Representation

```text
1 2 3
4 5 6
7 8 9
```

---

# Example

```java
int[][] matrix = {

    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}

};
```

---

# Traversing 2D Array

```java
for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        System.out.print(matrix[i][j] + " ");

    }

    System.out.println();

}
```

---

# Array Input Using Scanner

```java
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

    }
}
```

---

# Common Array Operations

| Operation | Description |
|------------|-------------|
| Traversal | Visit all elements |
| Insertion | Add element |
| Deletion | Remove element |
| Searching | Find element |
| Updating | Change value |
| Sorting | Arrange elements |

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Update | O(1) |
| Traversal | O(n) |
| Search (Linear) | O(n) |
| Search (Binary) | O(log n) |
| Insert | O(n) |
| Delete | O(n) |

---

# Linear Search

```java
int[] arr = {10, 20, 30, 40};

int target = 30;

for(int i = 0; i < arr.length; i++) {

    if(arr[i] == target) {

        System.out.println("Found");

    }

}
```

---

# Binary Search

Binary Search works only on sorted arrays.

Steps:

1. Find middle element
2. Compare with target
3. Search left or right half
4. Repeat

Time Complexity:

```text
O(log n)
```

---

# Advantages of Arrays

✅ Fast Access

✅ Easy Traversal

✅ Memory Efficient

✅ Useful in Algorithms

---

# Disadvantages of Arrays

❌ Fixed Size

❌ Costly Insertion

❌ Costly Deletion

❌ Same Data Type Only

---

# Arrays vs ArrayList

| Array | ArrayList |
|---------|----------|
| Fixed Size | Dynamic Size |
| Faster | Slightly Slower |
| Primitive Supported | Objects Only |
| Less Flexible | More Flexible |

---

# Common Array Problems

### Beginner

- Largest Element
- Smallest Element
- Sum of Array
- Average of Array
- Reverse Array

---

### Intermediate

- Second Largest Element
- Remove Duplicates
- Move Zeros
- Rotate Array
- Merge Arrays

---

### Advanced

- Kadane's Algorithm
- Two Sum
- Three Sum
- Majority Element
- Product of Array Except Self

---

# Dry Run Example

Array:

```text
[10, 20, 30, 40]
```

Traversal:

```text
i = 0 → 10
i = 1 → 20
i = 2 → 30
i = 3 → 40
```

---

# Common Mistakes

❌ Accessing invalid index

```java
arr[10];
```

ArrayIndexOutOfBoundsException

---

❌ Forgetting length condition

```java
for(int i = 0; i <= arr.length; i++)
```

Correct:

```java
for(int i = 0; i < arr.length; i++)
```

---

# Interview Questions

1. What is an array?
2. Why are arrays fixed in size?
3. What is contiguous memory allocation?
4. Difference between Array and ArrayList?
5. What is ArrayIndexOutOfBoundsException?
6. Time complexity of array operations?
7. Difference between Linear Search and Binary Search?

---

# Best Practices

✅ Use meaningful variable names

✅ Use enhanced for loop when possible

✅ Check array bounds

✅ Keep arrays sorted when using Binary Search

✅ Dry run before coding

---

# Summary

In Arrays, we learned:

- Array Basics
- Declaration
- Initialization
- Traversal
- Input
- Searching
- Time Complexity
- 2D Arrays
- Advantages & Disadvantages

Arrays are the foundation of Data Structures and Algorithms and are one of the most important topics for coding interviews and problem solving. 