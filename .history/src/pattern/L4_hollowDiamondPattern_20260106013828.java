package pattern;
import java.util.Scanner;

public class L4_hollowDiamondPattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        
        int Nrow = sc.nextInt();
        int Nstr = (Nrow/2)+1;
        int Nsp = 1;

        for(int i=0; i<Nrow; i++){
            for(int j=0; j<Nstr; j++){
                System.out.print("*");
            }
            for(int k=0; k<Nsp; k++){
                System.out.print("_");
            }
            for(int j=0; j<Nstr; j++){
                System.out.print("*");
            }
            if(i<Nrow/2){
                Nstr = Nstr-1;
                Nsp= Nsp+2;
            }else{
                Nstr = Nstr+1;
                Nsp = Nsp-2;
            }
            System.out.println();
        }
        sc.close();
    }
}
