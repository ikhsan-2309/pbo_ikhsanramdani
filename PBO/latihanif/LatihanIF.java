
package latihanif;

public class LatihanIF 
{
    public static void main(String[]args)
    {
        int pensil=(15000);
        int buku=(45000);
        int pulpen=(20000);
        int penghapus=(30000);
        int harga=(2*buku+1*pensil+3*pulpen+1*penghapus-5000);
    
    if (harga>100000)
    {
        int diskon=harga*10/100;
        int total=harga-diskon;  
            System.out.println(total);
    }
    else
    {
        int diskon=harga*5/100;
        int total=harga-diskon;
            System.out.println(total);            
    }
    }
}
       