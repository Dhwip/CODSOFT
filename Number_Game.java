import java.util.*;

class Number_Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int RandomNumber = rand.nextInt(100) + 1;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter Your Guess from 1-100: ");
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
            if (guess == RandomNumber) {
                System.out.println("Congratulations You Guessed it!");
                break;
            } else if (guess > RandomNumber) {
                System.out.println("You Guessed Too High Number");
            } else if (guess < RandomNumber) {
                System.out.println("You Guessed Too Low Number");
            }
            System.out.println("You have " + (7 - i) + " attemps left");
            if (7 - i == 0) {
                System.out.println("You Lose");
            }
        }
    }
}