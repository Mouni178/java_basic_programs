package Recursions;

public class CountEvenOddDigits {
    static int EvenCount=0;
    static int OddCount=0;
    static void countDigits(int n){
        if(n==0){
            return;
        }
        int digit=n%10;
        if(n%2==0){
            EvenCount++;
        }else{
            OddCount++;
        }
        countDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 752579853;
        countDigits(n);
        System.out.println("Even digits: " + EvenCount);
        System.out.println("Odd digits: " + OddCount);
    }
}
