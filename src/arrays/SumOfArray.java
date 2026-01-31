package arrays;
import java.util.Scanner;
public class SumOfArray {
    static int arraySum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of an array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=arraySum(arr);
        System.out.println("The sum of array is : " +result);
        double average=(double) result /n;
        System.out.println("The Average of array is : " +average);
    }
}
