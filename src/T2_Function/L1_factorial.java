package function;
import java.util.Scanner;
/*
Creating a programming to find out factorial of f(4)
    4! = 1*2*3*4 = 24
 */
public class L1_factorial {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int i=1;
        int ans=1;
        while(i<=n){
            ans = ans*i;
            i++;
        }
        System.out.print("The factorial of the given number : "+ans);
        sc.close();
    }
}