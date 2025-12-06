## 💡 Why Use Interfaces?

| Use Case                       | Why Interface Helps                               |
| ------------------------------ | ------------------------------------------------- |
| **Multiple inheritance**       | Class can implement many interfaces               |
| **Loose coupling**             | Code depends on the interface, not direct classes |
| **Abstraction**                | Defines behavior without implementation           |
| **Plug-and-Play Architecture** | Swap implementations easily                       |


## 🔍 Real-World Example:
```
interface Payment {
void pay(double amount);
}

class GooglePay implements Payment {
public void pay(double amount) {
System.out.println("Paid using GooglePay: " + amount);
}
}

class PhonePe implements Payment {
public void pay(double amount) {
System.out.println("Paid using PhonePe: " + amount);
}
}
```

## 🧩 Summary
```
1. Interface = blueprint of methods
2. Methods are abstract by default
3. Variables are constants (public static final)
4. Supports multiple inheritance
5. Cannot create objects
6. Can have default & static methods (since Java 8)
```