package switchcase;
import java.util.Scanner;
public class LatihanSwitchcase {
    public static void main(String[]args)
    {
        int nasgor,steak,mieayam,batagor,harga;
        nasgor=12000;
        steak=15000;
        mieayam=7000;
        batagor=8000;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan No Pesanan : ");
        harga = input.nextInt();
        switch(harga){
            case 1 : {System.out.println("Makanan yang anda pilih dengan harga" + nasgor);
                    break;} 
            case 2 : {System.out.println("Makanan yang anda pilih dengan harga" + steak);
                    break;} 
            case 3 : {System.out.println("Makanan yang anda pilih dengan harga" + mieayam);
                    break;}
            case 4 : {System.out.println("Makanan yang anda pilih dengan harga" + batagor);
                    break;}
            default :{System.out.println("Tidak ada ");}
        }
        if (harga == 1){
            System.out.println("Masukan Jumlah : ");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = " + nasgor * jumlah);
            
        }
        if (harga == 2){
            System.out.println("Masukan Jumlah : ");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = "+ steak * jumlah);
            
        }
        if (harga == 3){
            System.out.println("Masukan Jumlah : ");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = "+ mieayam * jumlah);
            
        }
        if (harga == 4){
            System.out.println("Masukan Jumlah : ");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = "+ batagor * jumlah);
            
        }
    }
}
