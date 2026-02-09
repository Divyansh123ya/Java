import java.util.Scanner;
public class sumoffirstn {
    public static void main(String arg[]) {
        int n,sum=0;
        Scanner scn=new Scanner(System.in);
        n=scn.nextInt();
        int i=1;
        while(i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
    
}
