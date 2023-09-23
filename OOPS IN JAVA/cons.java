import java.util.*;

//polymorphism
class Concept1{
    public void printInfo(String name){
        System.out.println("name : "+name);
    }
    public void printInfo(int age){
        System.out.println("age : "+age);
    }
    public void printInfo(String name,int age){
        System.out.println("name : "+name+" "+"age : "+age);
    }
}

//inheritance
class Human{
    public void sleep(){
        System.out.println("SLEEPS");
    }
}
class Dad extends Human{
    public void job(){
        System.out.println("DO JOB");
    }
}

class girl extends Dad{
    public void sing(){
        System.out.println("LIKES SINGING");
    }
}

public class cons {
    String name = "kanishk";
    int age = 21;
    public cons(){
        System.out.println("Default constructor");
        System.out.println(name);
        System.out.println(age);
    }
    public cons(String name,int age){
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    public cons(cons obj){
        System.out.println("Copy Constructor");
        this.name = name;
        this.age = age;
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    public static void main(String args[]){
        //constructors
        cons obj = new cons();
        cons obj1 = new cons("radha",19);
        cons obj2 = new cons(obj1);

        Concept1 p1 = new Concept1();
        p1.printInfo("MUSKAN");
        p1.printInfo(17);
        p1.printInfo("Muskan",17);

        girl I1 = new girl();
        I1.sleep();
        I1.job();
        I1.sing();
    }
}


//import java.nio.file.StandardOpenOption;
///**++++++++++++++++++   REVISION   +++++++++++++*/
//class Person{
//    //Function Overloading
//    public void toprint(String name){
//        System.out.println(name);
//    }
//    public void toprint(int age){
//        System.out.println(age);
//    }
//    public void toprint(String name,int age){
//        System.out.println(name+" "+age);
//    }
//}
//class School{
//    //Constructors
//    String name;
//    int add;
//    public School(){
//        System.out.println("DEFAULT CONSTRUCTOR");
//        name = "GITS";
//        System.out.println(name);
//    }
//    public School(String name,int add){
//        System.out.println("PARAMETERIZED CONSTRUCTOR");
//        this.name = name;
//        this.add = add;
//        System.out.println(this.name);
//        System.out.println(this.add);
//    }
//    public School(School O){
//        System.out.println("COPY CONSTRUCTOR");
//        System.out.println("Values Copied!!");
//        this.name = O.name;
//        this.add = O.add;
//        System.out.println(this.name);
//        System.out.println(this.add);
//    }
//}
//public class cons {
//    //
//    static void sprint(String name){
//        System.out.println("STATIC CALL");
//        System.out.println(name);
//    }
//    public void pprint(int age){
//        System.out.println("PUBLIC CALL");
//        System.out.println(age);
//    }
//    int x = 5;
//
//    public void toprint(){
//        System.out.println("FRUITS:");
//    }
//    String fruit1 = " APPLE";
//    String fruit2;
//    String fruit3 = " MANGO";
//
//    public static void main(String args[]){
//        cons obj1 = new cons();
//        obj1.toprint();
//        System.out.println(obj1.fruit1);
//        System.out.println(obj1.fruit2=" BANANA");
//        System.out.println(obj1.fruit3);
//        System.out.println("\nNUMBERS :");
//        cons num1 =  new cons();
//        cons num2 = new cons();
//        System.out.println(" "+num1.x);
//        num2.x = 25;
//        System.out.println(" "+num2.x);
//        //static call
//        System.out.println();
//        sprint("KANISHK");
//        //public call
//        obj1.pprint(21);
//
//        //constructors
//        School s1 = new School();
//        School s2 = new School("CA",1);
//        School s3 = new School(s2);
//
//        //Polymorphism
//        System.out.println("POLYMORPHISM : FUNCTION OVERLOADING");
//        Person p = new Person();
//        p.toprint("RADHA");
//        p.toprint(19);
//        p.toprint("KRSIHNA",21);
//    }
//}