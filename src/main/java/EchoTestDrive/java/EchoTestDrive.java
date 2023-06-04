package EchoTestDrive.java;

public class EchoTestDrive {
    public static void main(String[] args) {

        Echo e1 = new Echo();
        //Echo e2 = new Echo();
        Echo e2 = e1;

        int x = 0;

        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;

            if (x > 0) {
                e2.count = e2.count + 1;
            }//This is the end of the 1st conditional

            if (x > 1) {
                e2.count = e2.count + e1.count;
            }//This is the end of the 2nd conditional

            x = x + 1;
        }//This is the end of the 1st while
        System.out.println(e2.count);
    }//This is the end of the main method
}//This is the end of the class
