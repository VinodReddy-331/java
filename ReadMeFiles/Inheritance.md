# 📘 Java Inheritance — Types & Usage

Inheritance is one of the core pillars of **Object-Oriented Programming (OOP)**. It allows one class (**child/subclass**) to acquire the properties and behaviors of another class (**parent/superclass**).

---

## 🔥 Why Use Inheritance?

- Reuse code
- Reduce duplication
- Implement hierarchical structures
- Support polymorphism
- Model real-world "is-a" relationships

Example:  
`Car` **is a** `Vehicle`  
`Dog` **is an** `Animal`

---

# 🧩 Types of Inheritance in Java

Java supports the following types of inheritance:

---

## 1️⃣ Single Inheritance

A subclass inherits from **one** superclass.

```
Animal
   ↑
Dog
```

### Example:
```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

---

## 2️⃣ Multilevel Inheritance

A class extends a subclass, forming a chain.

```
Animal
   ↑
Dog
   ↑
Puppy
```

### Example:
```java
class Animal { void eat() {} }
class Dog extends Animal { void bark() {} }
class Puppy extends Dog { void weep() {} }
```

---

## 3️⃣ Hierarchical Inheritance

Multiple subclasses inherit from the same parent.

```
        Animal
       /   |   \
   Dog   Cat   Cow
```

### Example:
```java
class Animal { void eat() {} }

class Dog extends Animal { void bark() {} }
class Cat extends Animal { void meow() {} }
class Cow extends Animal { void moo() {} }
```

---

## 4️⃣ Hybrid Inheritance (via Interfaces)

Java **does not allow multiple inheritance via classes**, but **supports hybrid inheritance** using interfaces.

```
    Animal
      ↑
   Mammal      Pet (Interface)
        \       /
          Dog
```

### Example:
```java
interface Pet {
    void play();
}

class Animal {}
class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays");
    }
}
```

---

# 🚫 Unsupported in Java

### ❌ Multiple Inheritance (with classes)
Java does **not** allow:

```
class C extends A, B  // ❌ Not allowed
```

Reason:  
To prevent **Diamond Problem** (ambiguity of inherited methods).

Instead, Java uses **interfaces** for safe multiple inheritance.

---

# 🏡 Real-World Example of Inheritance

### Example: E-commerce System

```
Product
   ↑
Electronics
   ↑
Mobile
```

```java
class Product {
    double price;
}

class Electronics extends Product {
    int warranty;
}

class Mobile extends Electronics {
    String brand;
}
```

---

# 📝 Summary Table

| Inheritance Type | Supported in Java | Example |
|------------------|-------------------|---------|
| Single           | ✔ Yes             | A → B |
| Multilevel       | ✔ Yes             | A → B → C |
| Hierarchical     | ✔ Yes             | A → B, A → C |
| Multiple         | ❌ No (classes)    | Use interfaces |
| Hybrid           | ✔ Yes (interfaces)| Class + Interface |

---

