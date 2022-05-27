import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;

    public User(String n) throws InterruptedException {
        // main constructor
        name = n;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return("Name: " + getName());
    }

    public static String welcomeMessage() throws InterruptedException {
        Scanner s = new Scanner(System.in);System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
        String name = s.nextLine();
        System.out.println("\nWelcome " + name + ", I hope your day is going well.");
        Thread.sleep(2000);
        System.out.println("If not, I hope this project helps!\n");
        Thread.sleep(3500);
        return name;
    }


}
