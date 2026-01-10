package T3_Intro_To_Problem_Solving;
import java.util.Scanner;
/*
Identify if a number is a prime number or not
prime number => the number who has two factors only, 1 and that number it self
ex - 19 - > 1, 19 (2 factors, henece number 19 is a prime numbers)
 */
public class L3_primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=  sc.nextInt();
        primeNumberDitector(n);
        sc.close();
    }
    public static void primeNumberDitector(int n){
        int count=0;
        for (int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
            if(count<=2 && i==n){
                System.out.print("The number is prime");
                break;
            }else if(count>2){
                System.out.print("The number is not prime");
                break;
            }
        }
    }
}
