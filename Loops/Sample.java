import java.util.*;

public class Sample {
    public static void main(String args[]){
        System.out.println("LOOPS -");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N times -"+n);
        System.out.println("FOR LOOP -");
//        //It will run But only less than N
//        for (int i=0; i<n; i++){
//            System.out.println("Hello");
//        }
//        //It will run till N
//        for (int i=0; i<=n; i++){
//            System.out.println(i+"KANISHK");
//        }
        for (int i=0 ;i<n; i++){
            System.out.print(i+" ");//Print the Number less then N
        }
        System.out.println();
//
//        System.out.println("WHILE LOOP -");
//        int m = sc.nextInt();
//        System.out.println("M times -"+m);
//        int i = 0;
//        while (i < m){
//            System.out.print(i+" ");
//            i++;//i+1
//        }
//        System.out.println();
//
//        System.out.println("DO-WHILE LOOP");
//        int x = sc.nextInt();
//        do {
//            System.out.println(i);
//            i++;
//        }while (i < 11);
//        System.out.println();

        System.out.println("Print the sum of first n Natural Numbers - ");
        int y = sc.nextInt();
        int Sum = 0;//initialize
        for (int i=0; i<y; i++){
            Sum = Sum + i;//Do work
        }
        System.out.println(Sum);//Print Outside

        System.out.println("Print the Table -");
        System.out.println("Enter the Number to Print the Table -");
        int z = sc.nextInt();
        System.out.println("Table of : "+z);
        for (int i=0; i<11; i++){
            int mul = z * i;
            System.out.println(z+" * "+i+" = "+mul);
        }

        System.out.println("Print all Even & Odd Numbers till N");
        int p = sc.nextInt();
        for (int i=0; i<p; i++){
            if (i % 2 == 0){
                System.out.println(i+" EVEN");
            } else {
                System.out.println(i+" ODD");
            }
        }
    }
}
