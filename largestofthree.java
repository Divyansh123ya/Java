import java.util.Scanner;
public class largestofthree {
    public static void main(String srg[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        if(a>b&&a>c) {
            System.out.println(a+" is largest number");
        }
        else if(b>c) {
            System.out.println(b+" is largest number");
        }
        else {
            System.out.println(c+" is largest number");
        }

    } 
}
