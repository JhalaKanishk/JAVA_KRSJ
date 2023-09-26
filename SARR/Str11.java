import java.util.*;
//STOCK BUY & SELL
public class Str11 {
    static int toFind(int arr[],int n){
        int maxProfit = 0;
        int min_so_far = arr[0];
        for(int i=0;i<=n-1;i++){
            min_so_far = Math.min(arr[i],min_so_far);
            int profit = arr[i] - min_so_far ;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
    static void toPrint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        //input
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        toPrint(arr,n);

        System.out.println("Maximum Profit Earn : "+toFind(arr,n));
    }
}
