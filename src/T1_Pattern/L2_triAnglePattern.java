package T1_Pattern;
/*
    Problem: Print a triangle of stars - 
        *
        * *
        * * *
        * * * *
 */

import java.util.Scanner;

public class L2_triAnglePattern {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your number : ");

        int Nrow = sc.nextInt();
        int Nstr = 1;

        for (int i=0; i<Nrow; i++){
            for (int j=0; j<Nstr; j++){
                System.out.print("* ");
            }
            
            Nstr++;
            System.out.println();
        }
        sc.close();



    }
    
}
