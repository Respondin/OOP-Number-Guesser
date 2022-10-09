import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    NumberGuesser ng = new NumberGuesser(1, 100);
    do {
      System.out.print("Think of a number from 1 to 100\n");
      while (true) {
        int guessedNumber = ng.getCurrentGuess();
        System.out.print("Is the number " + guessedNumber + "? (h/l/c):");
        String input = sc.next();
        if (input.equals("h"))
          ng.higher();
        else if (input.equals("l"))
          ng.lower();
        else if (input.equals("c")) {
          System.out.println("You picked " + guessedNumber + "? Great pick.");
          break;
        } else {
          System.out.println("Invalid input.");
        }
      }
      System.out.print("Do you want to play again: (y/n):");
      String playAgain = sc.next();
      if (playAgain.equals("n"))
        break;
      else
        ng.reset();
    } while (true);

  }

}
