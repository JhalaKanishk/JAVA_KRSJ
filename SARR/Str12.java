import java.util.*;
public class Str12 {
    static void toPrint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
     static void reverse(int arr[],int start,int end){
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
     }
     static void swap(int arr[],int start,int end){
        int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
     }
    public void nextPermutation(int arr[]){
        int index1 = -1;
        int index2 = -1;
        int n = arr.length;
        //Step 1 : Find Break Point
        for (int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index1 = i;
                break;
            }
        }
        //No Break Point
        if(index1 == -1){
            reverse(arr,0,n-1);
        }
        //Step 2 : Just Greater then
        else{
            for (int i=n-1;i>=0;i--){
                if (arr[i] > arr[index1]){
                    index2 = i;
                    break;
                }
            }
            //swap
            swap(arr,index1,index2);
            //reverse the remaining half
            reverse(arr,index1+1,n-1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Str12 obj = new Str12();
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toPrint(arr,n);

        //To Find
        System.out.println("\nThe Next Greater Permutation is : ");
        obj.nextPermutation(arr);
        toPrint(arr,n);

    }
}
