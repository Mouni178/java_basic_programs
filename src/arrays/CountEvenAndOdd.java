package arrays;
import java.util.Scanner;
public class CountEvenAndOdd {
    static void evenOddCount(int[] arr){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
            System.out.println("Even count: " + evenCount);
            System.out.println("Odd count: " + oddCount);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        evenOddCount(arr);
    }
}
