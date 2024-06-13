public class Looping {
            public static void main(String[] args) {
                        int[] numbers = {1, 2, 3, 4, 5};

                        System.out.println("=====================");
                        System.out.println("= Isi Array Numbers =");
                        System.out.println("=====================");
                        for(int i = 0; i < numbers.length; i++)
                        {
                                    System.out.println("Elemen Ke-" + (i+1) + " = " + numbers[i] );
                        }
            }            
}
