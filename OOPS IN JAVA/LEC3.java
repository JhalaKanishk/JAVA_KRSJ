import java.util.*;
/**++++++++++++++++++   CONSTRUCTORS   +++++++++++++*/

class Teacher{
    String name;
    String spec;
    public Teacher(){
        System.out.println("DEFAULT");
    }
    public Teacher(String name ,String spec){
        System.out.println("PARAMETERIZED");
        this.name = name;
        this.spec = spec;
        System.out.println(this.name);
        System.out.println(this.spec);
    }
    public Teacher(Teacher obj){
        this.spec = obj.spec;
        this.name = obj.name;
        System.out.println(this.name);
        System.out.println(this.spec);
    }
}
public class LEC3 {
    int x;
    int y;
    public LEC3(){
        System.out.println("DEFAULT CONSTRUCTOR :");
        x = 21;
        System.out.println(x);
    }
    public LEC3(int x,int y){
        System.out.println("PARAMETERIZED CONSTRUCTOR :");
        this.x = x;
        this.y = y;
        System.out.println(this.x);
        System.out.println(this.y);
    }
    public LEC3(LEC3 obj){
        System.out.println("COPY CONSTRUCTOR :");
        this.x = obj.x;
        this.y = obj.y;
        System.out.println(this.x);
        System.out.println(this.y);
    }


    public static void main(String args[]){
        //AUTOMATIC CALL WHEN OBJECT IS CREATED!!
        LEC3 obj1 = new LEC3();
        LEC3 obj2 = new LEC3(4,2);
        LEC3 obj3 = new LEC3(obj2);
        //AUTOMATIC CALL WHEN OBJECT IS CREATED!!
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("MANISH","MATHS");
        Teacher t3 = new Teacher(t2);
    }
}
