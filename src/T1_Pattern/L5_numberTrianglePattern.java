package T1_Pattern;
import java.util.Scanner;

public class L5_numberTrianglePattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int Nrow = sc.nextInt();

        int Nnum = 1;
        int Num  = 0;

        for(int i=1; i<=Nrow; i++){
            for(int j=1; j<=Nnum; j++){
                Num++;
                System.out.print(Num+ " ");
            }
            Nnum++;
            System.out.println();
        }
        sc.close();
    }
}
