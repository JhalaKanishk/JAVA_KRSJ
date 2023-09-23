/**++++++++++++++++++   CLASSES AND OBJECTS   +++++++++++++*/
class Fruit{
    String fruit1 = " BANANA";
    String fruit2 = " APPLE";
    String fruit3 = " MANGO";
}
class Car{
    String name = "BMW";
    String type = "FUEL";
    int wheels  = 4;
}
public class LEC1 {
    int age = 21;
    String name = "Kanishk";
    String college;

    int x = 5;
    public static void main(String args[]){
        LEC1 obj1 = new LEC1();
        System.out.println("NAME : "+obj1.name+"\n"+"AGE : "+obj1.age);
        LEC1 obj3 = new LEC1();
        LEC1 obj4 = new LEC1();
        System.out.println("MULTIPLE OBJECTS :");
        System.out.println(obj3.name+" CALLED BY OBJECT1");
        System.out.println(obj4.name+" CALLED BY OBJECT2");
        Fruit obj2 = new Fruit();
        System.out.println("FRUITS :");
        System.out.println(obj2.fruit1);
        System.out.println(obj2.fruit2);
        System.out.println(obj2.fruit3);
        System.out.println("MODIFIED ATTRIBUTES :");
        LEC1 obj5 = new LEC1();
        obj5.college = "GITS";
        System.out.println("COLLEGE NAME : "+obj5.college);

        LEC1 obj6 = new LEC1();
        LEC1 obj7 = new LEC1();
        obj7.x = 25;
        System.out.println(obj6.x);
        System.out.println(obj7.x);

        System.out.println("CARS");
        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.type);
        System.out.println(c.wheels);

    }
}
