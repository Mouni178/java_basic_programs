package arrays;

/*ic class SecondMaxElement {
    static int secondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    arr[i]=Integer.MIN_VALUE;
                    break;
                }
            }
            int second=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>second){
                    second=arr[i];
                }
            }
            return second;
        }
    public static void main(String[] args){
        int[] arr={17,45,98,36,89,68};
        int result=secondMax(arr);
        System.out.print("The Second max Element in the array : " + result);
    }
}*/

public class SecondMaxElement {

    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {17, 45, 98, 36, 89, 68};
        int result = secondMax(arr);
        System.out.print("The Second max Element in the array : " + result);
    }
}
