package Recursions;


public class SumOfDigits {
    static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumDigits(n/10);
    }
    public static void main(String[] args){
        int result=sumDigits(73925473);
        System.out.print("The sum of digits in a given number is : " + result);
    }
}
