import java.util.Scanner;
import java.math.BigDecimal; 

public class password {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan password: ");
    String password = scanner.nextLine();

    int length = password.length();
    boolean hasLowerCase = false;
    boolean hasUpperCase = false;
    boolean hasDigit = false;
    boolean hasSymbol = false;

    for (char c : password.toCharArray()) {
      if (Character.isLowerCase(c)) {
        hasLowerCase = true;
      } else if (Character.isUpperCase(c)) {
        hasUpperCase = true;
      } else if (Character.isDigit(c)) {
        hasDigit = true;
      } else {
        hasSymbol = true;
      }
    }

    int charSets = 0;
    if (hasLowerCase) {
      charSets += 26;
    }
    if (hasUpperCase) {
      charSets += 26;
    }
    if (hasDigit) {
      charSets += 10;
    }
    if (hasSymbol) {
      charSets += 33;
    }

    double combinations = Math.pow(charSets, length);
    double entropy = Math.log(combinations) / Math.log(2);

    String strengthMessage;
    if (entropy >= 0 && entropy <= 35) {
      strengthMessage = "\033[91m Kekuatan Password: Sangat Lemah!\033[00m";
    } else if (entropy >= 36 && entropy <= 59) {
      strengthMessage = "\033[91m Kekuatan Password: Lemah!\033[00m";
    } else if (entropy >= 60 && entropy <= 119) {
      strengthMessage = "\033[92m Kekuatan Password: Kuat!\033[00m";
    } else {
      strengthMessage = "\033[92m Kekuatan Password: Sangat Kuat!\033[00m";
    }

    System.out.println("Your Password is " + strengthMessage);

    
    BigDecimal time = new BigDecimal(combinations).divide(BigDecimal.valueOf(10000000), 1, BigDecimal.ROUND_HALF_UP);
    printGuessingTime(time); 
  }

  public static void printGuessingTime(BigDecimal time) {
    if (time.compareTo(BigDecimal.ONE) < 0) {
      System.out.println("it will take less than 1 second to guess!");
    } else if (time.compareTo(BigDecimal.valueOf(60)) < 0) {
      System.out.println("it will take " + time.setScale(1, BigDecimal.ROUND_HALF_UP) + " seconds to guess!");
    } else {
      time = time.divide(BigDecimal.valueOf(60), 2, BigDecimal.ROUND_HALF_UP);
      if (time.compareTo(BigDecimal.valueOf(60)) < 0) {
        System.out.println("it will take " + time + " minutes to guess!");
      } else {
        
      }
    }
  }
}