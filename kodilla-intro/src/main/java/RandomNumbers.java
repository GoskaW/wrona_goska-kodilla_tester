import java.util.Random;

import static javax.swing.UIManager.getInt;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int RandomNumbers = random.nextInt(31);
        int min = 0;
        int max = 31;
        int sum = 0;

        while (sum <= 5000) {
            int n1 = random.nextInt(31);
            sum = sum + n1;
            System.out.println(sum);
        }
        // metoda na wywołanie najmniejszej i największej return? jeśli tak to jak się za to zabrać?
    }
}



