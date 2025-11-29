# Method Overloading in Java

## 1️⃣ What is Method Overloading?

Method overloading is when a class has **multiple methods with the same name** but **different parameters**.

* Parameters can differ by:

    * Number of parameters
    * Type of parameters
    * Order of parameters

> Return type **alone cannot** distinguish overloaded methods.

**Example:**

```java
public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));          // calls add(int, int)
        System.out.println(calc.add(5, 10, 15));      // calls add(int, int, int)
        System.out.println(calc.add(5.5, 4.5));       // calls add(double, double)
    }
}
```

**Output:**

```
15
30
10.0
```

---

## 2️⃣ Key Rules for Overloading

1. **Same method name**
2. **Different parameter list**
3. Return type **can be different** but **cannot be the only difference**
4. Can be in the **same class** or **child class** (compile-time polymorphism)

---

## 3️⃣ Why is it Useful?

1. **Code readability & maintainability**

    * Use the same method name for similar operations.
    * Example: `add()`, `print()`, `display()` for different data types or counts.

2. **Compile-time Polymorphism**

    * Java decides **which method to call at compile time** based on parameters.
    * Makes code flexible without changing method names.

3. **Reduces code duplication**

    * Instead of creating different method names like `addTwoInts`, `addThreeInts`, etc., you just overload `add()`.

4. **Improves API usability**

    * Makes it easier for other developers to use your class.

---

## 4️⃣ Visual Flow

```
Method call: add(5, 10)       → calls add(int,int)
Method call: add(5, 10, 15)   → calls add(int,int,int)
Method call: add(5.5, 4.5)    → calls add(double,double)
```

* JVM selects the **correct method** based on **number & type of arguments**.

---

## 5️⃣ Summary Table

| Feature     | Explanation                                         |
| ----------- | --------------------------------------------------- |
| Name        | Same for all overloaded methods                     |
| Parameters  | Must differ (number, type, or order)                |
| Return type | Can differ but not used to distinguish methods      |
| Purpose     | Flexibility, readability, compile-time polymorphism |
| Benefit     | Easier to maintain, reduces duplicate code          |
