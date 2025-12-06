# Java `switch` Statement — Complete Guide

The `switch` statement allows you to run different blocks of code based on the value of a variable or expression.  
This guide provides a clean, beginner-friendly summary including rules, examples, and a flow diagram.

---

## 📌 1. Rules for Using a `switch` Statement

### 🎯 Allowed Data Types
You can use the following types in a `switch` expression:

- `int`
- `byte`, `short`, `char` (convertible to int)
- `String`
- `enum`

---

### 🎯 Any Number of Case Blocks
You can define multiple case labels:

```java
case 1:
case 2:
case "Admin":
```
---
### 🎯 Case Value Must Match Data Type
The case value:
Must be the same data type as the switch variable
Must be a constant, literal, or final compile-time value

```java
✔ Allowed
final int X = 10;
case X:
```
---
###
### Execution Continues Until `break`
When a matching case is found:
Code runs from that case onward
Execution only stops when break is encountered