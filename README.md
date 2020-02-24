# Design Patterns In Java
Types
- Creational
- Structural 
- Behavioral

# 1. Creational Design pattern in java
- Pattern is way of good communication, reusability, abstraction
- This pattern provides best ways to create objects in application. 

Main types of creational patterns
- Singleton
- Builder
- Prototype
- Factory
- AbstractFactory

## Singleton Pattern
- Singleton design pattern is responsible for manage lifecycle of instace since creation.
- Singleton should be a thread safe so they are static by nature 
- Singleton class should have private instance and private construtor to manage instance creation and maintain by there own only.
- Singleton returns same instance everytime and it have only one construtor with no arguments.
- Singleton class does not implements any interface due to it have private construtor and instance.

Problems with sigleton
- use static mechanism is always heavy
- use everything as a singleton will make a problem to slow down the application
- singleton is not thread safe so need to take care when we use it without threading

## Builder Pattern
- Builder pattern is aften use but its rare to create own builder pattern. this pattern is very useful when we have to construct the object may    contains a lots of parameter and we want to make a object immutable once done the construction. 
- with Builder patern we can force the object to immutability once created. 
- Best examples in Java API is StringBuilder class, DocumentBuilder class for complex object creation, 
  Local.Builder is another example which take multiple parameters as a part of its construction.
- Builder pattern typically use static inner class in implemenation 
- Builder pattern handle complex constructors 
- No interface required as a static inner class does eerything.
- Helps developers to works with legacy code and aviod rework.

Example : StringBuilder
- this is good example of builder design pattern which helps in performance, easy way to build a string rather than using + operator etc, faster than string buffer.   

### Pros
1) Code is more maintainable if number of fields required to create object is more than 4 or 5.
2) Object Creation code less error-prone as user will know what they are passing because of explicit method call.
3) Builder pattern increase robustness, as only fully constructed object will be available to client.
4) You can force immutability to the object once its created.
### Cons
1) Builder pattern is verbose and requires code duplication as Builder needs to copy all fields from Original or Item class.
2) Inner static class may cause for increase memory usage.

## Prototype Pattern
- It implement cloning mechanism and avoid calling complex constructors 
- Prototype works against Builder pattern its avoid subclassing, low cos.
- Prototype dont use new keyword, first instance may use new keyword but after that they use clone() method 
- Prototype normalaly use interfaces
- Prototype create a registry and keep object in registry when first time created then they clone new object from registry when needed nexr time.
- Best example in java is java.lang.Object#clone method
- Prototype use clone() or Clonable interface in design.
- Each instance is copied but unique
- As the architect you can choose wheather you want to do a shallow vs deep copy. A shallow copy is just copies the immediate properties where as deep copy copies references of object too. 
*example is pending

## Factory Pattern
- Most often used pattern
- It doesnt expose the instantiation logic (highly abstraction), client can use the object but not aware about implemenation
- All client knows is common interface which factory pattern use is.
- Examples in java API is :
  - Calender
  - Resource Bundle
  - NumberFormat
- Factory pattern is responsible for object lifecycle
- designed with common interfaces and concrete classes and use parameterized create method 

## AbstractFactory Pattern
- AbstractFactory pattern is typically similar as factory pattern typically it is created as a factory of factory pattern
- It also take a concept of common interface a step further. the common interface is implement through out the abstract factory and its underlying factories just like a the factory method pattern is differing the instantiation or creation logic to subclass as well. 
- Examples
  - DocumentBuilder 
  - Dao layer factories
- Design
  - Groups factories together
  - Responsible for object lifecycle
  - Common interface
  - use parameterized create method
