package function;
import java.util.Scanner;
/*
Calculating factorial using function 
 */
public class L3_factorial_function {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.print("Your factorial of the given number : "+ans);
        sc.close();
    }
    public static int factorial(int n){
        int ans=1;
        for(int i=1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }
    
}
