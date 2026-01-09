package intro_to_problem_solving;
import java.util.Scanner;

/*
Calculating the number of factors of a number
Ex: factors of 24 = 1,2,3,4,6,8,12,24 -> numbers of factors = 8
 */

public class L1_numberOfFactors {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.print("Number of factors of your given number : "+count);
        sc.close();
    }
}