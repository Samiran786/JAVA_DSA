package pattern;
import java.util.Scanner;

public class L3_diamondPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");

        int Nrow = sc.nextInt();
        int Nstr =1;
        int Nsp = Nrow/2;
        for(int i=0; i<Nrow; i++){
            for(int k =0; k<Nsp; k++){
                System.out.print(" ");
            }
            for(int j=0; j<Nstr; j++){
                System.out.print("*");
            }

            if(i < Nrow/2){
                Nstr = Nstr+2;
                Nsp--;
            }else{
                Nstr = Nstr-2;
                Nsp++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
