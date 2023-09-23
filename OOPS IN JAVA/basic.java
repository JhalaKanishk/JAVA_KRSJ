
//CLASSES name = capital
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something!!");
    }
    public void printColor(){
        //this is keyword
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printname(){
        System.out.println(this.name);
    }
    public void printinfo(){
        System.out.println(this.age);
    }
}
class Mandir{
    String name;
    String god_name;
    public void print(){
        System.out.println("MANDIR NAME : "+this.name);
        System.out.println("GOD NAME : "+this.god_name);
    }

}
public class basic {
    public static void main(String args[]){
        //OBJECTS
        pen pen1 = new pen();
        //assign a type
        pen1.color = "red";
        pen1.type = "gel";

        pen pen2 = new pen();
        //
        pen2.color = "blue";
        pen2.type = "ball";
        pen1.write();

        pen1.printColor();
        pen2.printColor();

        //new keyword memory heap memory is allocated in a block.
        Student s1 = new Student();
        s1.name = "kanishk";
        s1.age = 21;
        s1.printname();
        s1.printinfo();

        Mandir m1 = new Mandir();
        m1.name = "JAGDISH MANDIR";
        m1.god_name = "JAGANATH SWAMI";
        m1.print();
    }

}
