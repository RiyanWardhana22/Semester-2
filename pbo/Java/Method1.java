public class Method1 {
            // Method Void
            static void Method1()
            {
                        System.out.println("Hello World");
            }

            // static void methodPemanggil(){
            //             Method1();
            // }

            void nonStaticMethod()
            {
                        System.out.println("Method Non Static");
            }

            // Static Parameter Method
            static void methodParam1(String nama)
            {
                        System.out.println("Nama Saya = " +  nama);
            }
            
            // Non Static Parameter Method
            void methodParam2(String nama)
            {
                        System.out.println("Nama Kamu = " + nama);
            }
            
            public static void main(String[] args) {
                        methodParam1("Riyan Wardhana"); // Pemanggilan Method Static
            Method1 j1 =  new Method1(); // Pemanggilan Method Non Static
                        j1.methodParam2("Said Iskandar"); // Non Stati'c 


                        Method1(); // Pemanggilan Method Static
            Method1 jm =  new Method1(); // Pemanggilan Method Non Static
                        jm.Method1(); // Non Stati'c 
            }
            
}