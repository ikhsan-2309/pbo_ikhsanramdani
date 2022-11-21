package operator;
import java.util.Scanner;
public class Operator {
    public static void main(String[]args)
    {
        int nilai1, nilai2 ,nilai3;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.println("Masukan Nilai 2 : ");
        nilai2 = input.nextInt();
        System.out.println("Masukan Nilai 3 : ");
        nilai3 = input.nextInt();
        
        int penjumlahan = nilai1 + nilai3;
        int perkalian = nilai2 * nilai3;
        
        System.out.println("Nilai 1 = "+ nilai1);
        System.out.println("Nilai 2 = "+ nilai2);
        System.out.println("Nilai 3 = "+ nilai3);
        System.out.println("NIlai 1 + Nilai 3 = "+ penjumlahan);
        System.out.println("NIlai 2 * Nilai 3 = "+ perkalian);
        
        if (nilai1 > nilai2 && nilai1 > nilai3)
            {System.out.println("nilai 1 lebih besar dari nilai 2 dan nilai 3");}
        else if (nilai2 > nilai1 && nilai2 > nilai3)
            {System.out.println("nilai 2 lebih besar dari nilai 1 dan nilai 3");}
        else if (nilai3 > nilai2 && nilai3 > nilai1)
            {System.out.println("nilai 3 lebih besar dari nilai 1 dan nilai 2");}
    }       
}
