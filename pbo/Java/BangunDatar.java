public class BangunDatar {
            public int luas;

            public void persegi(int sisi)
            {
                        this.luas = sisi * sisi;
                        this.cetakLuas("Persegi");
            }

            public void cetakLuas(String bd)
            {
                        System.out.println("Luas " + bd + " = " + this.luas);
            }

            public static void main(String[] args) {
                        BangunDatar bangun1 = new BangunDatar();
                        bangun1.persegi(5);
            }
}