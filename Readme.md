## Exo 1
1) Concepts of encapsulation, inheritence, and polymorphism
   1)Explain the concept of encapsulation and the way it is implemented in Java and Explain the following concepts:

   mutator method (setter)

   accessor method (getter)

2) The concept of encapsulation is the degree of protection that we put for an object.

Private, Public or protected.We can only access those private elements (or protected) by using getters and modify those by using setters.

3) Explain two different meanings/roles of:

"this" permit to access the constructor.
«super» permit to access the methods and constructors of the parent class.

4) Explain the concept of inheritence and the way it is implemented in Java

Inheritence is implemented with extends in a child class.It permits to use methods of the parent class.

5) Explain the concept of polymorphism, name its three main kinds/forms, and explain the way they are implemented in Java
Polymorphism allows a single interface, method, or entity to operate on different underlying types:

Subtype: Allows an object of a subtype to be handled by a reference of its supertype. Implemented in Java via class inheritance, and method overriding, resolved at runtime via dynamic dispatch.

Ad-hoc : Allows multiple methods to share the same name with different signatures. Implemented in Java via method overloading and built-in operator overloading.

Parametric: Allows writing generic logic where concrete types are supplied as parameters. Implemented in Java using Generics enforced at compile-time and cleaned up via type erasure.

6) Relationship Between Inheritance and Subtype

Inheritance is about implementation reuse.

Subtype Polymorphism is about type substitutability (an instance of a subtype can be passed wherever a supertype is expected, satisfying the Liskov Substitution Principle).

While class inheritance provides both implementation reuse and subtyping, Java can also achieve subtype polymorphism without inheriting implementation details through interfaces (implements).

## Exo 2
1) Explain the following concepts:

static variable (field/class member)

static constant

static method

So, static variables belongs to the class itself rather than to any individual instance.
A static field marked with the final keyword. Its value belongs to the class, is shared across all instances, and cannot be reassigned or modified once initialized.
A method associated with the class rather than an object. It can be called directly using the class name without creating an instance of the class first.

2) Explain why static constants often have public visibility

Static constants are declared public because they are marked final, meaning their values are immutable.

3) Explain why static methods do not have access to instance members (methods and fields)

Static methods are methods that do not operate on objects (they do not receive an implicit first argument).

4) Give one example of a static method application

## Exo 3

1) Object initialization begins with class loading, where static variables are allocated in memory, set to language defaults, and initialized alongside anonymous static blocks in the order they appear. When an object is instantiated via new, heap memory is allocated. The constructor is called, immediately delegating upward to Object’s constructor via super.
Once that completes, instance variable initializers and anonymous instance blocks execute top-to-bottom, and finally the remaining constructor body runs to complete the object's creation.

2) 1) D9 <-- D1 <-- B1
   2) The Object constructor completes.
The body of the B1 constructor executes.
The body of the D1 constructor executes.
Finally, the body of the D9 constructor executes.


3) Capabilities of Constructors vs. Factory Methods
A constructor must always match the class name and strictly create a brand-new instance of that specific class every time it is invoked with new. In contrast, a static factory method can have a descriptive name and offers far greater return flexibility, like returning a subtype. Furthermore, while multiple constructors are restricted to having unique parameter type signatures, several factory methods can accept identical parameter lists simply by using different method names.
4) Applications of the Singleton Pattern
App Settings: Ensures the whole program reads from one shared source so settings stay consistent everywhere.
Logging: Directs all messages or print jobs through a single queue so multiple parts of the program do not write over each other and corrupt the file.

## Exo 4
1) Strategy for Defining Immutable Objects

To create an immutable class, declare the class as final so it cannot be extended or overridden. Mark all fields as private and final, and initialize all of them exclusively through the constructor. Provide only accessor methods (getters) with zero mutators (setters). If fields contain mutable reference types, use defensive copying both when passing them into the constructor and when returning them from getters.

2) Immutable Object vs. Immutable Class

An immutable object is a specific instance whose internal state cannot be modified after it is instantiated, even if the class blueprint technically permits mutation in some contexts. An immutable class is the blueprint itself designed in such a way that every single instance it produces is guaranteed to be immutable under all circumstances

3) Advantages of Immutable Objects

   Immutable objects are inherently thread-safe because multiple threads can read their data concurrently without requiring locks or synchronization.They prevent unexpected side-effects across distant parts of an application since no outside code can alter their data.

4) Two Uses of Java Records


   Data Transfer Objects: Transporting structured, read-only data between application layers, API endpoints, or database query results without writing boilerplate getters, constructors, equals(), or hashCode().

Compound Keys: Serving as simple multi-value tuples, composite map keys, or returning multiple values from a method where a lightweight, immutable carrier is needed.

## Exo 5
1. Difference Between == and equals()

Primitives: Only == is allowed and it compares the value.
Objects:** == compares the memory address (identity), while .equals() compares the logical content.



2. Formula o1.equals(o2) ⟹ hashCode(o1) == hashCode(o2)

If two objects are equal, they must produce the same hash code. This is mandatory so hash-based collections can store and locate the object in the correct bucket.

3. Contract of equals and hashCode

equals: Must be reflexive (x = x), symmetric (x = y \iff y = x), transitive (x = y prodscal y = z \implies x = z), consistent, and return false for null.
hashCode: Must return the same integer if the object remains unchanged, and must return the same integer for two objects that are equal according to equals.

