package pewarisan2;
public class Kubus extends BangunRuang{
     private double  s;
        public Kubus(){
            super();
            System.out.println("mencetak anak : Kubus\n");
            s=10;
            nama = "ini Kubus";
        }
        public double Volume(){
            return s*s*s;
        }
        public void infoKubus(){
            System.out.println("Nama :"+ nama);
            System.out.println("Nilai r :"+this.s);
            System.out.println("Luas Lingkaran : " +Volume());
        }
}
