package T3_Intro_To_Problem_Solving;

import java.util.Scanner;

public class L3_primeNumber_Optimized {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        primeNumberChecker(n);
        sc.close();
    }
    public static void primeNumberChecker(int n){
        int count = 0;
        for(int i=1; i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count = count+2;
                }
            }
        }
        if(count>2){
            System.out.print("The number is non prime number");
        }else{
            System.out.print("The number is prime number");
        }
    }
    
}
