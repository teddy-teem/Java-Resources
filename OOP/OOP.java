package oop;


//Blueprint of Pen  
class Pen {
    String color;
    String type; //ballpoint; gel;

    public void write() {
        System.out.println("Writing something....");
    }
    public void printPenDetails() {
        System.out.println(this.color + " color & "+ this.type);
    }
}

//Constructor
// -> is method
// -> Constructor construct Object.  in Java, If constructor not defined, it create automatically one constructor else use the created one.
// -> constructor doesn't return anything else.
// -> for an object, a constructor can calls only once. 
// -> if we create any parameterized constructor, then need to pass constructor else need to create not parameterized constructor. 
// -> There is no destructor in java, Java has garbage collector that destroy unused object automatically
class Student {
    String name;
    int age;
    public void printInfo() {  
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student() { //Normal constructor
        System.out.println("Constructor called");
    }
    Student(String name, int age) { //parameterized constructor
        this.name=name; //this.name is object's data where need to assign, name is params data
        this.age=age; //this.age is object's data where need to assign, age is params data
    }
    Student(Student s2) { //copy constructor
        this.name=s2.name;  //s2's name being copied to the current object
        this.age=s2.age; //s2's age being copied to the current object
    }
}

//Polymorphism
// two types of polymorphism 
// 1. Function Overloading. Compile time
// 2. Function Overriding. Run time
class Teacher {  //Example of compile time polymorphism / Function overloading. 
    String name;
    int age;
    public void printInfo() {  
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
    // need to differ from each other function
    // 1. can be differ return type
    // 2. can be differ by argument type
    // 3. can be differ by number of params. 
}

//Inheritance
// transferring properties of classes to other classes
class Shape {
    String color;
}
class Triangle extends Shape { //extends keyword used to inherited class Shape, this is how we can inherit
    //String color; is now available in this class 
}
//Type of inheritance

//Single Level Inheritance
class Human {
    public void printInfo(String name) {
        System.out.println(name+"  is a human");
    }
}
class Jahid extends Human { //Jahid is a human, so extended Human class is single level inheritance.
    public void printInfo() {
        System.out.println("I a human");
    }
}
//multilevel inheritence 
class Atma extends Jahid {
    public void printInfo(int age) {
        System.out.println("I am "+age+" older");
    }
}
//Hierarchial Inheritance
class Hasan extends Human { //Hasasn & Jahid both inherited HUman
    public void main(String name) {
        System.out.println(name+" is from hassan");
    }
}

//Access modifier - who can access whit property - Encapsulation
//4 type of access modifier
class Access {
    String name; //default:  only the package can access
    public int id; //public: who will create it's object can access
    protected String status; //Any who inherit this class can access
    private int age; //only this class can access
    //using getters & setters we can access private properties
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }   
    
}
 
//Abstraction - means show important things to user, hide unnecessary things
//Can be implemented using Abstract keyword or making interfaces
abstract class Animal { // just a blueprint, a concept, will not create it's object
    public void walk () { //Every animal can walk, that's it's mentioned, it's just a plan, We can call this method from it's childs object;
        System.out.println("Can walk");
    }
    //We can abstract a function also.
    abstract void eat();  // must be implemented in child classes
    Animal() {
        System.out.println("Created an Animal");
    }

}
class Horse extends Animal {
    Horse() {  //First will call Animal's constructor, then Horse's// it's constructor chaining
        System.out.println("Horse created");
    }

    public void eat() {
        System.out.println("Eat grasses");
    }
}
class Chicken extends Animal {
    public void eat() {
        System.out.println("Eat rice");
    }
}


//Interface - Pure Abstraction Class
interface Jin { //no constructor for interfaces
    int eyes = 2;  //by default it will be public static type, for all type of object there will be 2 eyes
    void walk(); // by defaul public & abstruct
    void eat(); //{ } // can't implement function in interface
}
interface Angel {
    void fly();
}
class Pari implements Jin, Angel { //Can inherit multiple interface in Java, but not classes 
    public void walk() { // need to define public keyword
        System.out.println("Can fly too");
    }
    public void eat() {
        System.out.println("Eat good things");
    }
    public void fly() {
        System.out.println("can fly");
    }
}

class StaticExample {
    static int multiply(int a, int b) {  // can access without object, we can directly call StaticExample.multiply();
        return a*b;
    }
}


public class OOP {
    // Static refers to a common value for all it's object.
    // Static can be mentioned before variable, class, block, nested class;
    // Since static members are associated with the class, they are loaded into memory only once, regardless of how many instances of the class are created. 
    // Utility Methods that will perfomr common operation for all the object
    public static void main(String args[]) {

        Pen p1 = new Pen();  //new keyowrd create memory allocation in memory. 
       
        Jahid jahid = new Jahid();
        jahid.printInfo(); // normal function call,
        jahid.printInfo("Hasan"); // run time polymorphism

        Atma atma = new Atma();
        atma.printInfo(); // will call I am human bcz of multilevel inheritence;
        atma.printInfo("Jahid");  // will print Jahid is a Human,
        atma.printInfo(10); // will print I am 10 older

        // Encapsulation . p1, jahid, atma is encapsulated in a object.
        // Package is like afolder where we write same type of code.

        System.out.println(StaticExample.multiply(5, 5));





    }
    
}
