package T3_Intro_To_Problem_Solving;

import java.util.Scanner;

public class L2_numberOfFactors_OptimizedByLec {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n= sc.nextInt();
        int ans= factor(n);
        System.out.print("Number of factors : "+ans);
        sc.close();
    }
    public static int factor(int n){
        int count=0;
        for(int i=1; (i*i)<=n; i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }else{
                    count=count+2;
                }
            }
        }
        return count;
    }
    
}
