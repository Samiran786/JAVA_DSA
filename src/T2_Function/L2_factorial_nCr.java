package T2_Function;

import java.util.Scanner;

/*
we have 2 value, n and r. find the combination with formula !n/(!r * !(n-r))
 */
public class L2_factorial_nCr {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        System.out.print("Enter the number r : ");
        int r = sc.nextInt();
        int Nans=1;
        int Rans=1;
        for (int i=1; i<=n; i++){
            Nans = Nans*i;
        }
        for(int i=1; i<=r; i++){
            Rans = Rans*i;
        }
        int NRans=1;
        for(int i=1; i<=(n-r); i++){
            NRans = NRans*i;
        }
        int mainAns = Nans/(Rans*NRans);
        System.out.print("Combination of the given numbers : "+mainAns);
        sc.close();
    }
    
}
