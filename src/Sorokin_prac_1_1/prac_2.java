package Sorokin_prac_1_1;
import java.util.Scanner;
public class prac_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        int k = 0, summa = 0;
        System.out.println("Ведите 10 целых чисел: ");
        do {
            if(sc.hasNextInt())
            {
                b[k] = sc.nextInt();
                summa += b[k];
                System.out.println("Текущая сумма элементов: " + summa);
                k++;
            }
        }while(k < 10);
        k=1;
        int minx, maxx;
        minx = maxx = b[0];
        while (k<10)
        {
            if (b[k] > maxx)
                maxx = b[k];
            if (b[k] < minx)
                minx = b[k];
            k++;
        }
        System.out.println("Минимальный элемент: " + minx);
        System.out.print("Максимальный элемент: " + maxx);
    }
}