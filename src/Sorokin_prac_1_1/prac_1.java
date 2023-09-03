package Sorokin_prac_1_1;
import java.util.Scanner;
public class prac_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        int k;
        float summa=0f;
        System.out.println("Ведите 10 целых чисел: ");
        for (k = 0; k < 10; k++)
        {
            if(sc.hasNextInt())
            {
                b[k] = sc.nextInt();
                summa += b[k];
                System.out.println("Текущая сумма: " + summa);
                System.out.println("Текущее среднее арифметическое: " + summa/(k+1));
            }
        }
    }
}