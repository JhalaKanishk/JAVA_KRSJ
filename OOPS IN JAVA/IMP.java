//ABSTRACTION : INTERFACES
interface Zoo{
    void eats();
}
interface amphibians{
    void swims();
}
class Fish implements Zoo,amphibians{
    public void eats(){
        System.out.println("eats fish food");
    }

    public void swims() {
        System.out.println("swims in water");
    }
}


//INHERITANCE
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}

//POLYMORPHISM
class Polymorphism{
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}

//ENCAPSULATION
class Encapsulation{
    private String college;
    public void setname(String clg){
        this.college = clg;
    }
    public String getname(){
        return college;
    }
}

public class IMP {
    String name;
    int age = 20;
    //CONSTRUCTORS
    public IMP(){
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    public IMP(int age,String name){
        System.out.println("PARAMETERIZED CONSTRUCTOR");
        this.name = name;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public IMP(IMP obj){
        System.out.println("COPY CONSTRUCTOR");
        this.name = obj.name;
        this.age = obj.age;
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public static void main(String args[]){
        //classes & objects
        //constructors
        IMP obj = new IMP();
        IMP obj1 = new IMP(15,"MEGHA");
        IMP obj2 = new IMP(obj1);

        System.out.println(obj.name = "kanishk");
        obj.age = 21;
        System.out.println(obj.age);

        //inheritance
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();

        //polymorphism
        Polymorphism pobj = new Polymorphism();
        pobj.printInfo("RADHA");
        pobj.printInfo(19);
        pobj.printInfo("RADHA",19);

        //encapsulation
        Encapsulation eobj = new Encapsulation();
        eobj.setname("GITS");
        System.out.println(eobj.getname());

        //abstraction
        Fish f1 = new Fish();
        f1.eats();
        f1.swims();
    }
}
