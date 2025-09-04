# Inheritance in Java

Inheritance is one of the four fundamental Object-Oriented Programming (OOP) concepts in Java. It allows a new class (subclass or child class) to acquire the properties and behaviors (fields and methods) of an existing class (superclass or parent class). Inheritance promotes code reusability, method overriding, and polymorphism.

## Why Use Inheritance?
- **Code Reusability:** Share common code between classes.
- **Method Overriding:** Child classes can provide specific implementations of methods defined in the parent class.
- **Extensibility:** Add new features to existing code without modifying it.

## Syntax of Inheritance

```java
class Parent {
    // parent class members
}

class Child extends Parent {
    // child class members
}
```
Here, `Child` inherits from `Parent` using the `extends` keyword.

## Types of Inheritance in Java

Java supports several types of inheritance:

### 1. Single Inheritance
A class inherits from one superclass only.
```java
class A { }
class B extends A { }
```

### 2. Multilevel Inheritance
A class inherits from another class, which in turn inherits from another class.
```java
class A { }
class B extends A { }
class C extends B { }
```

### 3. Hierarchical Inheritance
Multiple classes inherit from a single superclass.
```java
class A { }
class B extends A { }
class C extends A { }
```

### 4. Multiple Inheritance (Not Supported Directly)
Java does **not** support multiple inheritance with classes to avoid ambiguity. However, it can be achieved using interfaces.
```java
interface X { }
interface Y { }
class Z implements X, Y { }
```

## Example

```java
// Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();  // Inherited method
        d.bark(); // Own method
    }
}
```

## Key Points
- Use the `extends` keyword for class inheritance.
- Java supports single, multilevel, and hierarchical inheritance.
- Multiple inheritance is possible only through interfaces.
- Constructors are not inherited.
- Private members of the superclass are not accessible directly in the subclass.

---

**References:**
- [Oracle Java Documentation - Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [GeeksforGeeks - Types of Inheritance in Java](https://www.geeksforgeeks.org/inheritance-in-java/)
