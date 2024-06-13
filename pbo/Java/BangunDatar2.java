import java.util.Scanner;

public class BangunDatar2 {
    double luas;
    String namaBangun;

    void tampilkanHasil(){
        System.out.println("Luas Bangun " + this.namaBangun + " adalah : " + luas);
    } 

    void luasPersegi(double sisi){
        this.namaBangun = "Persegi";
        this.luas = sisi * sisi;
        this.tampilkanHasil();
    }

    void luasPersegiPanjang(double p, double l){
        this.namaBangun = "Persegi Panjang";
        this.luas = p * l;
        this.tampilkanHasil();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Masukkan nilai sisi : ");
        // double sisi = scanner.nextDouble();

        System.out.print("Masukkan nilai P : ");
        double p = scanner.nextDouble();
        System.out.print("Masukkan nilai L : ");
        double l = scanner.nextDouble();

        BangunDatar2 bd2 = new BangunDatar2();
        // bd2.luasPersegi(sisi);
        bd2.luasPersegiPanjang(p, l);

        scanner.close();
    }
}
