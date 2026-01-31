package arrays;
import java.util.Scanner;
public class SearchElement {
    static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Elements in an array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element you ant to search : ");
        int x=sc.nextInt();
        int result=search(arr,x);
        if(result==-1){
            System.out.print("Element not Found");
        }else{
            System.out.print("Element Found at " + result);
        }
    }
}
