import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
            int randomNumber = objGenerator.nextInt(100);
            System.out.println("Random No : " + randomNumber);
        }

        // Using Java Math.Random
        for(int xCount = 0; xCount< 10; xCount++){
            System.out.println(Math.random());
        }
    }
}
