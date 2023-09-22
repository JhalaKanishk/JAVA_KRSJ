import java.util.*;
public class Sample {
    public static void main(String args[]){
        System.out.println("CONDITIONAL STATEMENTS -");
        Scanner sc = new Scanner(System.in);

        //if-else condition -
        System.out.println("if-else condition -");
        System.out.println("Enter Age -");
        int Age = sc.nextInt();
        if (Age > 18){
            System.out.println("ADULT");
        } else {
            System.out.println("NOT ADULT");
        }
        System.out.println("Enter Number -");
        int Num = sc.nextInt();
        if (Num % 2 == 0){
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        System.out.println("Enter Numbers -");
        int x = sc.nextInt();
        System.out.println("X : "+x);
        int y = sc.nextInt();
        System.out.println("Y : "+y);
        if (x == y){
            System.out.println("EQUAL");
        } else if (x > y) {
            System.out.println("X is Greater");
        } else {
            System.out.println("Y is Greater");
        }

        System.out.println("Enter Button -");
        int Button = sc.nextInt();
//        if (Button == 1){
//            System.out.println("HELLO");
//        } else if (Button == 2) {
//            System.out.println("NAMASTE");
//        } else if (Button == 3) {
//            System.out.println("BONJOUR");
//        }else {
//            System.out.println("INVALID");
//        }

        switch (Button) {
            case 1: System.out.println("HELLO");
                break;
            case 2: System.out.println("NAMASTE");
                break;
            case 3: System.out.println("BONJOUR");
                break;
            default: System.out.println("INVALID");
        }

        //CALCULATOR
        System.out.println("CALCULATOR -");
        System.out.println("Enter A -");
        int A = sc.nextInt();
        System.out.println("A : "+A);
        System.out.println("Enter B -");
        int B = sc.nextInt();
        System.out.println("B : "+B);
        System.out.println("Enter 1 For Addition -");
        System.out.println("Enter 2 For Subtraction -");
        System.out.println("Enter 3 For Multiplication -");
        System.out.println("Enter 4 For Division -");
        int Operations = sc.nextInt();
        if (Operations == 1){
            System.out.println("Addition : "+(A+B));
        } else if (Operations == 2) {
            System.out.println("Subtraction : "+(A-B));
        } else if (Operations == 3) {
            System.out.println("Multiplication : "+(A*B));
        } else if (Operations == 4) {
            System.out.println("Division : "+(A/B));
        }
        else {
            System.out.println("INVALID OPERATION");
        }

        //MONTH PRINTER
        System.out.println("ENTER MONTH - ");
        int MONTH = sc.nextInt();
        System.out.println("Month : "+MONTH);
        switch (MONTH){
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INVALID");
        }
    }
}
