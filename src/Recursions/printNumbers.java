package Recursions;

public class printNumbers {
    static void print(int n){
        if(n==0){    //base case
            return;
        }
        print(n-1);   //recusive call
        System.out.println(n);
    }
    public static void main(String[] args){
        print(10);
    }
}
