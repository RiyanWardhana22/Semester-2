package enkapsulasi;
public class Validation {
            private int birthYear;

            public Validation(int birthYear){
                        setBirthYear(birthYear);
            }

            public void setBirthYear(int year){
                        if(year >= 1980 && year <= 2015){
                                    this.birthYear = year;
                        }
                        else{
                                    System.out.println("Tahun Lahir harus diantara 1980 dan 2015");
                        }
            }

            public int getBirthYear(){
                        return birthYear;
            }

            public static void main(String[] args) {
                        
                        Validation person = new Validation(1990);
                        System.out.println("Tahun Lahir = " + person.getBirthYear());

                        person.setBirthYear(1975);
                        person.setBirthYear(2015);
                        System.out.println("Tahun Lahir setelah validasi = " + person.getBirthYear());
            }
}
