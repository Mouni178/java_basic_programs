package arrays;
import java.util.Scanner;
public class RemoveDuplicates {
    //for sorted array
    static int removeduplicates(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    //for unsorted array
    static int removeDuplicatesUnsorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }
        return n;
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
        System.out.print("Is array sorted? (1 = yes, 0 = no): ");
        int choice = sc.nextInt();
        int newLength;
        if(choice==1){
            newLength = removeduplicates(arr);
        }
        else {
            newLength = removeDuplicatesUnsorted(arr, n);
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
