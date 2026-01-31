package arrays;
import java.util.Scanner;
public class ReverseArray {  //this is the correct method(teo pointers)
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("reversed array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
/*public class ReverseArray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        System.out.print("Original Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }

}*/