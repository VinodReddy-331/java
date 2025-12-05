| **Type**       | **Belongs To**    | **Needs Object?** | **Example**           |
| -------------- | ----------------- | ----------------- | --------------------- |
| **public**     | Open to all       | —                 | `public int age;`     |
| **private**    | Only inside class | —                 | `private int salary;` |
| **static**     | Class level       | ❌ No              | `ClassName.method()`  |
| **non-static** | Object level      | ✔ Yes             | `obj.method()`        |


🔑 Java Keywords: public, private, static, non-static

A beginner-friendly explanation of four fundamental Java concepts.

🟦 public

Accessible from anywhere.

Useful for methods/variables intended to be used by other classes.

🟥 private

Accessible only inside the same class.

Protects sensitive data from outside modification.

🟨 static

Belongs to the class itself, not to any object.

Only one copy exists and is shared across all objects.

Can be accessed without creating an object.

🟩 non-static

Belongs to each individual object.

Every object gets its own copy.

Requires object creation to access.