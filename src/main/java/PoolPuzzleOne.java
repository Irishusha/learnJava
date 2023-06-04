public class PoolPuzzleOne {
    public static void main(String[] args) {
        // Starting conditions
        int x = 0;

        // x < 4 was given as one of the available conditions
        while(x < 4) {
            // Print an "a" for every line
            System.out.print("a");

            // If x is less than 1, print a space
            if(x < 1) {
                System.out.print(" ");
            }

            // Print an "n" for every line
            System.out.print("n");

            // If x is more than 1, (third run) print " oyster" and
            // Increament the counter by 2, so the loop wont run again
            if(x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }

            // If x is equal to 1, (the second run) print "noys"
            if(x == 1) {
                System.out.print("noys");
            }

            // Again if x is less than 1 (first run), print "oise"
            if(x < 1) {
                System.out.print("oise");
            }

            // Print new line after each line
            System.out.println("");


            x = x + 1;

        }
    }
}