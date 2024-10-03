import java.util.Random;

public class RandomExplanation {
    public static void main(String[] args) {
        // Creating an instance of the Random class
        Random random = new Random();

        // Generate a random integer
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer within a range (0 to 9)
        int boundedInt = random.nextInt(10);
        System.out.println("Bounded Random Integer (0-9): " + boundedInt);

        // Generate a random double
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);
    }
}