/**++++++++++++++++++   POLYMORPHISM   +++++++++++++*/
class Men{
    public void fun(String name){
        System.out.println(name);
    }
    public void fun(int age){
        System.out.println(age);
    }
    public void fun(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class LEC4 {
    // COMPILE TIME POLYMORPHISM
    // FUNCTION OVERLOADING
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
    public static void main(String args[]){
        LEC4 l1 = new LEC4();
        l1.printInfo("kanishk");
        l1.printInfo(21);
        l1.printInfo("RADHA",19);

        Men m1 = new Men();
        m1.fun("Rahul");
        m1.fun(25);
        m1.fun("Rahul",25);
    }
}
