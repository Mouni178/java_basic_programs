package arrays;

/*public class CopyArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.print("Copied Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(copy[i]+ " ");
        }
    }
}*/
public class CopyArray{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int copy[]=arr.clone();
        for(int i=0;i<arr.length;i++){
            System.out.print(copy[i] + " ");
        }
    }
}


