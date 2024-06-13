import java.util.Scanner;
public class ytta1 {

            public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        int i, j;

                        System.out.println("===========================");
                        System.out.println("= Nama : Riyan Wardhana   =");
                        System.out.println("= NIM  : 4233550008       =");
                        System.out.println("===========================");
                        
                        System.out.print("Inputkan Sebuah Bilangan bulat i = ");
                        i = input.nextInt();
                        
                        System.out.print("Inputkan Sebuah Bilangan bulat j = ");
                        j = input.nextInt();
                        
                        System.out.println("===========================");
                        int a = i * j;
                        System.out.println("Hasil Perkalian i dan j adalah = " + a);

                        input.close();
            }
}