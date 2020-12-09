import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        Scanner getNum = new Scanner(System.in);

        System.out.println("Out how many do you want to guess from?");
        int max = getNum.nextInt();
        int min = 1;

        int number = (int) (Math.random() * (max - min + 1) + min);

        while(true){
        
            System.out.println("\nGuess a number 1 through " + max + ": ");
            int guess = getNum.nextInt();
            if (guess != number){
                System.out.println("You guessed wrong. Try again!");
            }
            else{
                System.out.println("You guessed right! Good Job!\n");
                break;
            }
        }



    }
  }
