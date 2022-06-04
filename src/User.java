import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private MainCmds m;

    public User() {
        m = new MainCmds();
    }

    public void welcomeMessage() throws InterruptedException {
        try {
            File f = new File("src/PersonData.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                name = s.nextLine();
            }
            m.createLists("src/RemainingMessages.txt");

            System.out.println(Color.WHITE_BRIGHT + "Welcome back to the " + Color.BLUE_BRIGHT + "Positivity Machine " + Color.WHITE_BRIGHT + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this helps!\n");
            Thread.sleep(3500);
        }
        catch (IOException e) {
            m.createLists("src/AllFiles.txt");
            Scanner s = new Scanner(System.in);
            System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
            name = s.nextLine();

            System.out.println("\nWelcome " + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this project helps!\n");
            Thread.sleep(3500);
        }
        m.updateName(name);
        m.menu();
    }
}
