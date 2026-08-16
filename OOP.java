/*
//Classes and Objects
public class OOP {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}        
class Pen{
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
*/
/* 
//Inheritance
public class OOP{
    public static void main(String args[]){
        Fish Shark = new Fish();
        Shark.eat();
    }
}
class Animal{     //-Base class
    void eat(){
        System.out.println("eats");
    }
}
class Fish extends Animal{
    int fins;
    void Swim(){
        System.out.println("Swim in water");
    }
}
*/
/* 
//Polymorphism
//--Method Overloading
class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        Calculator obj = new Calculator();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
    }
}
*/
/*
//Method Overriding
public class OOP{
    public static void main(String args[]){
        Dog d = new Dog();
        d.Sound();
    }
}
class Animal{
    void Sound(){
        System.out.println("Animal makes a Sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog Barks");
    }
}
*/
/* 
//Abstraction
public class OOP{
    public static void main(String args[]){
        Horse h = new Horse();
        h.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
*/
//Interfaces
public class OOP{
    public static void main(String args[]){
        Test obj = new Test();
        obj.show();
        obj.display();
    }
}    
interface A{
    void show();
}
interface B{
    void display();
}
class Test implements A, B{
    public void show(){
        System.out.println("Show Method");
    }
    public void display(){
        System.out.println("Display method");
    }
}