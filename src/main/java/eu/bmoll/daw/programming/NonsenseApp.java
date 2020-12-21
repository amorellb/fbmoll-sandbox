package eu.bmoll.daw.programming;

import eu.bmoll.daw.programming.helper.ConsoleUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class NonsenseApp {
    private static  final String EXIT_KEY = "9";

    public static void main(String[] args) {
        boolean aux = StringUtils.equals("a", "A");
        System.out.println("Hola Mundo: " + aux);

        ConsoleUtils consoleUtils = new ConsoleUtils();
        boolean isExit = false;
        while (!isExit) {
            String s = consoleUtils.getUserInput();
            System.out.println("You entered string " + s);
            isExit = StringUtils.equals(s, EXIT_KEY);
        }

        System.out.println("-END-");

    }
}
