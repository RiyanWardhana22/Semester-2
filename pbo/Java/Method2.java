public class Method2 {

            static String methodSapa()
            {
                        System.out.println("Haloo");
                        return "Halo";
            }

            // Method Non Static Non Paramater
            String methodSapa2()
            {
                        System.out.println("Halo 2");
                        return "Halo 2";
            }

            public static void main(String[] args) {
                        System.out.println(methodSapa());
                        
            Method2 jm2 = new Method2();
            System.out.println(jm2.methodSapa2());
            }
}
