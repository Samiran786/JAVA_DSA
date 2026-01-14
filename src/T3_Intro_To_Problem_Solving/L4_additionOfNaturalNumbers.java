package T3_Intro_To_Problem_Solving;
import java.util.Scanner;

public class L4_additionOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        int ans = add(n);
        System.out.print("Result : "+ans);
        sc.close();
    }
    public static int add(int n){
        int ans  = (n*(n+1))/2;
        return ans;
    }
    
}
