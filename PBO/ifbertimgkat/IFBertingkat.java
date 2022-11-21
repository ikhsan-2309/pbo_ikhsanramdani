
package ifbertimgkat;
import java.util.Scanner;

public class IFBertingkat {
    public static void main(String[]args)
    {   
        int nilai1,nilai2,nilai3;
        
        Scanner key = new Scanner(System.in);
        System.out.println("masukan nilai 1 :");
        nilai1 = key.nextInt();
        System.out.println("masukan nilai 2 :");
        nilai2 = key.nextInt();
        System.out.println("masukan nilai 3 :");
        nilai3 = key.nextInt();
        
        if(nilai1>nilai2)
        {System.out.println("nilai 1 lebih besar dari nilai 2");}
        else if (nilai1>nilai3)
        {System.out.println("nilai 1 lebih besar dari nilai 3");}
        else if (nilai2>nilai3)
        {System.out.println("nilai 2 lebih besar dari nilai 3");}
        else if (nilai2>nilai1)
        {System.out.println("nilai 2 lebih besar dari nilai 1");}
        else if (nilai3>nilai2)
        {System.out.println("nilai 3 lebih besar dari nilai 2");}
        else if (nilai2<nilai3)
        {System.out.println("nilai 2 lebih kecil dari nilai 3");}
        else if (nilai3<nilai2)
        {System.out.println("nilai 3 lebih kecil dari nilai 2");}
        else if (nilai1<nilai3)
        {System.out.println("nilai 1 lebih kecil dari nilai 3");}
        else if (nilai1<nilai2)
        {System.out.println("nilai 1 lebih kecil dari nilai 2");}
        else
        {System.out.println("nilai 2 lebih kecil dari nilai 1");}
    }       
}
