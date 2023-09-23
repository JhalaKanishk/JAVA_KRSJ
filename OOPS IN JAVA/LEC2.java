/**++++++++++++++++++   JAVA CLASS & METHODS   +++++++++++++*/


//outside the class you have to use public not static
class Main1{
    public void car(){
        System.out.println("SUPRA IS GOING FAST!!");
    }
    public void speed(int x){
        System.out.println("SPEED : "+x+" KMPH");
    }
}


public class LEC2 {
        static void sjeep(String name){
            System.out.print(name+"MODEL OF JEEP HAVE 4 WHEELS");
        }
        public void speed(int x){
            System.out.println("SPEED : "+x+" kmph ");
        }

    static void staticPrint(){
        System.out.println("STATIC METHOD CALLED");
    }
    public void publicPrint(){
        System.out.println("PUBLIC METHOD CALLED");
    }
    public void pprint(String name,int age){
        System.out.println("NAME : "+name+"\n"+"AGE : "+age);
    }
    static void sprint(String name,int age){
        System.out.println("NAME : "+name+"\n"+"AGE : "+age);
    }
    public static void main(String args[]){
        //calling without object
        staticPrint();
        //calling with object
        LEC2 obj1 = new LEC2();
        obj1.publicPrint();
        obj1.pprint("kanishk",21);
        sprint("Radha",19);
        Main1 m = new Main1();
        m.car();
        m.speed(200);

        LEC2 j = new LEC2();
        sjeep("WILLYS 24X7");
        //calling with obj pub()
        j.speed(25);
    }
}
