public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 15;
        int guess = 17;
        if(guess == secretNumber){
            System.out.println("Guess is correct");
        } else if(guess > secretNumber){
            System.out.println("Guess is too high");
        } else {
            System.out.println("Guess is too low");
        }
    }
}
