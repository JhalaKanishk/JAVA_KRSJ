/**++++++++++++++++++   INNER CLASSES   +++++++++++++*/
class OuterClass{
    int x = 10;
    class InnerClass{
        int y = 5;
    }
}
public class LEC5 {
    public static void main(String args[]){
        OuterClass obj1 = new OuterClass();
        OuterClass.InnerClass obj2 = obj1.new InnerClass();
        System.out.println("OUTER CLASS+INNER CLASS : "+obj1.x+obj2.y);
    }
}
