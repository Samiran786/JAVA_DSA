package function;

import java.util.Scanner;
/*
Calculating nCr by creating function
 */
public class L4_factorial_nCr_function {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you n :");
        int n=sc.nextInt();
        System.out.print("Enter your r : ");
        int r=sc.nextInt();
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);
        int ans = nFact/(rFact*nrFact);
        System.out.print("Your nCr : "+ans);
        sc.close();
    }
    public static int factorial(int n){
        int ans =1;
        for(int i=1; i<=n;i++){
            ans = ans*i;
        }
        return ans;
    }
}
