import java.util.*;
public class Sample {
    public static void printfactorial(int n){
        int Factorial = 1;
        if (n < 0){
            System.out.println("invalid number");
            return;//direct bhar
        }
        for (int i=1; i<=n; i++){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);//you can return
        return;
    }
    public static int printMul(int a, int b){
        return a * b;
    }
    public static int printSum(int a, int b){
        int sum = a + b;
        return sum;//give the value
    }
    public static void printName(String name){
        System.out.println(name);
        return;//out fom function
    }
    public static void main(String args[]){
        System.out.println("FUNCTIONS -");

        Scanner sc = new Scanner(System.in);

        //STRING
        String name = sc.nextLine();
        printName(name);//for void
        //pass all the inputs int argument

        //Make A Functions to ADD 2 numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SUM : "+printSum(a,b));
        System.out.println("MULTIPLY : "+printMul(a,b));


        int n = sc.nextInt();
        printfactorial(n);
    }
}
