import java.util.Scanner;
public class switchCase {
            public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        System.out.println("=============================================");
                        System.out.print(" Masukkan Angka Yang Anda Inginkan (1-5) : "); 
                        int angka = input.nextInt();
                        System.out.println("=============================================");

                        switch (angka) {
                        case 1:
                        System.out.println("Selamat, Anda Mendapatkan Sepeda!");     
                        break;    

                        case 2:
                        System.out.println("Selamat, Anda Mendapatkan Pesawat!");     
                        break;     

                        case 3:
                        System.out.println("Selamat, Anda Mendapatkan Laptop!");     
                        break;  

                        case 4:
                        System.out.println("Selamat, Anda Mendapatkan Tas!");     
                        break;  

                        case 5:
                        System.out.println("Selamat, Anda Mendapatkan Handphone!");     
                        break;
                        
                        default:
                        System.out.println("Anda Kurang Beruntung, tidak ada hadiah untuk angka tersebut.");
                        }

                        input.close();
            }
}
