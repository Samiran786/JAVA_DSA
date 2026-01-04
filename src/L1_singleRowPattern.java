import java.util.Scanner;

public class L1_singleRowPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your desired number :");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print("* ");
        }
        sc.close();
    }
    
}
