package Factory;

import java.util.Scanner;

/**
 * Created by Marshall on 12/11/2015.
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("input:\n");
        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            String strInput = input.nextLine();
            if (strInput.contentEquals("Apple")) {
                new Apple().buildPhone();
            } else if (strInput.contentEquals("Sumsung")) {
                new Sumsung().buildPhone();
            }
        }
    }

}
