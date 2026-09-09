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