# Functions in Java 

## What is a Function?

A function is a reusable block of code that performs a specific task.

Instead of writing the same code repeatedly, we create a function and call it whenever needed.

---

# Simple Definition

> A function is a group of statements that works together to perform a particular task.

---

# Why Do We Use Functions?

Functions help make programs:

| Benefit | Explanation |
|---|---|
| Reusable | Same code can be used multiple times |
| Easy to Read | Program becomes organized |
| Easy to Debug | Errors can be found easily |
| Easy to Maintain | Changes can be done in one place |
| Reduces Code Duplication | Avoids repeated code |
| Modular Programming | Large programs divided into smaller parts |

---

# Function Syntax

```java
returnType functionName(parameters) {

    // code

}
```

---

# Example

```java
class Demo {

    static void greet() {

        System.out.println("Hello Java");

    }

    public static void main(String[] args) {

        greet();

    }
}
```

---

# Components of a Function

A function mainly contains 5 components:

| Component | Meaning |
|---|---|
| Function Declaration | Creating the function |
| Function Name | Name used to identify function |
| Parameters | Inputs accepted by function |
| Function Body | Actual code inside function |
| Return Statement | Sends result back |

---

# Components Example

```java
class Demo {

    static int add(int a, int b) {

        int result = a + b;

        return result;

    }

    public static void main(String[] args) {

        int sum = add(10, 20);

        System.out.println(sum);

    }
}
```

---

# Components Identification

| Part | Component |
|---|---|
| `static int add(int a, int b)` | Function Declaration |
| `add` | Function Name |
| `a, b` | Parameters |
| `int result = a + b` | Function Body |
| `return result` | Return Statement |
| `add(10, 20)` | Function Call |

---

# Sequential Flow of Function

Function execution happens step by step.

## Flow

1. Program starts
2. Function call occurs
3. Control transfers to function
4. Function executes
5. Return statement sends control back
6. Remaining program executes

---

# Example

```java
class Demo {

    static void display() {

        System.out.println("Inside Function");

    }

    public static void main(String[] args) {

        System.out.println("Start");

        display();

        System.out.println("End");

    }
}
```

---

# Output

```text
Start
Inside Function
End
```

---

# Types of Functions

Functions are mainly divided into:

1. Non-Parameterized Function
2. Parameterized Function
3. Recursive Function

---

# 1. Non-Parameterized Function

A function that does not accept parameters.

---

# Example

```java
class Demo {

    static void greet() {

        System.out.println("Welcome");

    }

    public static void main(String[] args) {

        greet();

    }
}
```

---

# 2. Parameterized Function

A function that accepts parameters.

---

# Example

```java
class Demo {

    static void add(int a, int b) {

        System.out.println(a + b);

    }

    public static void main(String[] args) {

        add(10, 20);

    }
}
```

---

# 3. Recursive Function

A function that calls itself repeatedly until condition becomes false.

---

# Example

```java
class Demo {

    static int factorial(int n) {

        if(n == 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }
}
```

---

# Parameters vs Arguments

| Parameter | Argument |
|---|---|
| Variable in function definition | Actual value passed |
| Placeholder | Real data |
| Defined during function creation | Given during function call |

---

# Example

```java
static void add(int a, int b)
```

Here:
- `a` and `b` → parameters

```java
add(10, 20);
```

Here:
- `10` and `20` → arguments

---

# Return Type

Return type specifies what value the function returns.

---

# Example

```java
static int square(int num) {

    return num * num;

}
```

Here:
- `int` → return type

---

# void Function

A `void` function does not return anything.

---

# Example

```java
static void message() {

    System.out.println("Hello");

}
```

---

# Function Call Stack

Whenever a function is called:
- memory is allocated
- function executes
- memory is removed after completion

Functions use stack memory.

---

# Stack Memory

Stack memory stores:

- Local variables
- Function calls
- Parameters

It works in:

```text
LIFO → Last In First Out
```

---

# Stack Frame

Whenever a function executes, a stack frame is created.

A stack frame stores:
- local variables
- parameters
- return address

---

# Example

```java
static int add(int a, int b) {

    int c = a + b;

    return c;

}
```

Stack frame stores:

| Variable | Value |
|---|---|
| a | 10 |
| b | 20 |
| c | 30 |

---

# Heap Memory

Heap memory stores:
- objects
- dynamic memory
- class instances

---

# Example

```java
Student s1 = new Student();
```

---

# Memory Visualization

```text
STACK                HEAP
-----                -----
s1  ------------->   Student Object
```

---

# Call By Value in Java

Java uses Call By Value.

A copy of variable is passed to function.

Original value remains unchanged.

---

# Example

```java
class Demo {

    static void change(int x) {

        x = 50;

        System.out.println(x);

    }

    public static void main(String[] args) {

        int a = 10;

        change(a);

        System.out.println(a);

    }
}
```

---

# Output

```text
50
10
```

---

# Function Overloading

Function overloading means:

> Multiple functions having same name but different parameters.

---

# Example

```java
class Demo {

    static int add(int a, int b) {

        return a + b;

    }

    static int add(int a, int b, int c) {

        return a + b + c;

    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10, 20, 30));

    }
}
```

---

# Function Overriding

Function overriding happens when child class provides its own implementation of parent class function.

---

# Example

```java
class Parent {

    void show() {

        System.out.println("Parent Function");

    }
}

class Child extends Parent {

    void show() {

        System.out.println("Child Function");

    }
}

class Demo {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();

    }
}
```

---

# Difference Between Overloading and Overriding

| Overloading | Overriding |
|---|---|
| Same class | Parent and child class |
| Different parameters | Same parameters |
| Compile-time concept | Runtime concept |
| Multiple methods | Inheritance concept |

---

# Built-in Functions

Java provides many built-in functions.

Examples:

```java
Math.max()
Math.min()
Math.sqrt()
Math.pow()
```

---

# Example

```java
class Demo {

    public static void main(String[] args) {

        System.out.println(Math.max(10, 20));

    }
}
```

---

# Common Mistakes

❌ Forgetting return statement  
❌ Wrong return type  
❌ Infinite recursion  
❌ Wrong function call  
❌ Mismatched parameters

---

# Time Complexity

Simple functions mostly have:

:contentReference[oaicite:1]{index=1}

Recursive functions may have higher complexity.

---

# Important Function Programs

- Addition Function
- Prime Number using Function
- Fibonacci using Function
- Factorial using Function
- Calculator using Functions
- Recursive Countdown

---

# Interview Questions

1. What is a function?
2. Difference between parameter and argument?
3. What is recursion?
4. What is return type?
5. Difference between void and int?
6. What is function overloading?
7. What is function overriding?
8. What is stack memory?

---

# Best Practices

✅ Use meaningful function names  
✅ Keep functions small  
✅ Avoid duplicate code  
✅ Use proper indentation  
✅ Write comments

---

# Summary

In Functions, we learned:

- Function declaration
- Function calling
- Parameters
- Arguments
- Return type
- Recursion
- Stack memory
- Heap memory
- Overloading
- Overriding

Functions are one of the most important concepts in Java and DSA 🚀