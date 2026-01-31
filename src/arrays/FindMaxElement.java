package arrays;
import java.util.Scanner;
public class FindMaxElement{
    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the size of an array:");
            int n=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = findMax(arr);
            System.out.println(result);
        }
}

/*public class FindMaxElement {
    public static void main(String[] args){
        int[] arr={1,5,2,8,56,87,34};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The max element in array:"+ max);
    }
}*/

