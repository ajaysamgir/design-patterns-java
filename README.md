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
- Best examples in Java API is StringBuilder class, DocumentBuilder class for complex object creation, Local.Builder is another example which take multiple parameters as a part of its construction.
- Builder pattern typically use static inner class in implemenation 

StringBuilder
- this is good example of builder design pattern which helps in performance, easy way to build a string rather than using + operator etc, faster than string buffer.   
