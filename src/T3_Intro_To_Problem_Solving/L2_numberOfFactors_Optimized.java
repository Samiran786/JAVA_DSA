package T3_Intro_To_Problem_Solving;
import java.util.Scanner;
/*
Finding out number of factor with optimized way
*/
public class L2_numberOfFactors_Optimized {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factor(n);
        System.out.print("YOur ans : "+ans);
        sc.close();
    }
    public static int factor(int n){
        int ans=0;
        int count=0;
        int k =0;
        for(int i=1; (i*i)<=n; i++){
            if(n%i==0){
                count++;
            }
            k=i;
        }
        
        if(k*k==n){
            ans = (count*2)-1;
        }else{
            ans = count*2; 
        }
        return ans;
    }
}