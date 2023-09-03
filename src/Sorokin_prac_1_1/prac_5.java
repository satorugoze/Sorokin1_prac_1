package Sorokin_prac_1_1;
import java.util.Scanner;
public class prac_5 {
    public static int fac(int x) {
        if (x == 1)
            return 1;
        return x*fac(x-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ведите целое число: ");
        System.out.print("Его факториал = " + fac(sc.nextInt()));
    }
}
