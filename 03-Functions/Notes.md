# Functions in Java 

## What are Functions?

Functions are blocks of code used to perform a specific task.

Functions help:
- reuse code
- reduce repetition
- improve readability
- make programs modular

---

# Why Use Functions?

✅ Code reusability  
✅ Cleaner code  
✅ Better organization  
✅ Easier debugging  
✅ Saves time

---

# Syntax of Function

```java
returnType functionName(parameters) {

    // code

}
```

---

# Example

```java
class Example {

    static void greet() {

        System.out.println("Hello Java");

    }

    public static void main(String[] args) {

        greet();

    }
}
```

---

# Parts of a Function

| Part | Meaning |
|---|---|
| static | Function belongs to class |
| void | No return value |
| greet | Function name |
| () | Parameters |

---

# Function Declaration

```java
static void display() {

    System.out.println("Welcome");

}
```

---

# Function Calling

```java
display();
```

---

# Types of Functions

| Type | Description |
|---|---|
| Without parameters | No input |
| With parameters | Takes input |
| With return type | Returns value |
| Without return type | No returned value |

---

# Function Without Parameters

```java
class Demo {

    static void hello() {

        System.out.println("Hello");

    }

    public static void main(String[] args) {

        hello();

    }
}
```

---

# Function With Parameters

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

# Function With Return Type

```java
class Demo {

    static int square(int num) {

        return num * num;

    }

    public static void main(String[] args) {

        int result = square(5);

        System.out.println(result);

    }
}
```

---

# Return Statement

The `return` keyword sends value back from function.

Example:

```java
return a + b;
```

---

# Parameters vs Arguments

| Parameter | Argument |
|---|---|
| Variable in function | Actual value passed |

Example:

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

# Function Flow

```text
main()
   ↓
Function Call
   ↓
Function Executes
   ↓
Returns Result
```

---

# Example Flow

```java
class Demo {

    static int add(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        int result = add(5, 10);

        System.out.println(result);

    }
}
```

---

# Built-in Functions

Java already provides many built-in functions.

Examples:

```java
Math.sqrt()
Math.max()
Math.min()
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

# Recursive Function

A recursive function calls itself.

---

# Example

```java
class Demo {

    static void print(int n) {

        if(n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);

    }

    public static void main(String[] args) {

        print(5);

    }
}
```

---

# Advantages of Functions

✅ Reusability  
✅ Cleaner programs  
✅ Easy maintenance  
✅ Better readability  
✅ Modular programming

---

# Disadvantages of Functions

❌ Too many functions can confuse beginners  
❌ Extra memory for function calls

---

# Common Mistakes

❌ Forgetting return statement  
❌ Wrong return type  
❌ Calling function incorrectly  
❌ Infinite recursion

---

# Dry Run Example

## Function

```java
static int add(int a, int b) {

    return a + b;

}
```

## Function Call

```java
add(5, 10);
```

## Dry Run

```text
a = 5
b = 10

return 15
```

---

# Time Complexity

Most simple functions have:

:contentReference[oaicite:0]{index=0}

Recursive functions may have higher complexity depending on logic.

---

# Important Function Programs

- Addition Function
- Factorial using Function
- Prime Number using Function
- Fibonacci using Function
- Calculator using Functions
- Recursive Countdown

---

# Interview Questions

1. What is a function?
2. Difference between parameter and argument?
3. What is recursion?
4. What is return type?
5. Difference between void and int function?
6. Why use functions?
7. What is function overloading?

---

# Best Practices

✅ Use meaningful function names  
✅ Keep functions small  
✅ Avoid duplicate code  
✅ Write comments  
✅ Use proper indentation

---

# Summary

In Functions, we learned:

- Function declaration
- Function calling
- Parameters
- Arguments
- Return type
- Recursion
- Built-in functions

Functions are one of the most important concepts in Java and DSA 