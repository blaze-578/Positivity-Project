import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private MainCmds m;

    public User() throws InterruptedException  {
        name = "";
        m = new MainCmds();
        welcomeMessage();
    }

    public void welcomeMessage() throws InterruptedException {
        try {
            File f = new File("src/PersonData.txt");
            Scanner s = new Scanner(f);
            String name = s.nextLine();
            m.createLists("src/RemainingMessages.txt");

            System.out.println("\nWelcome back to the " + Color.BLUE_BRIGHT + "Positivity Machine " + Color.WHITE_BRIGHT + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this helps!\n");
            Thread.sleep(3500);
        }
        catch (IOException e) {
            m.createLists("src/AllFiles.txt");
            Scanner s = new Scanner(System.in);
            System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
            String name = s.nextLine();

            System.out.println("\nWelcome " + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this project helps!\n");
            Thread.sleep(3500);
        }
        m.updateName(name);
        m.menu();
    }

    public void save() {
        try {
            File f = new File("src/person.data");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/person.data");
            fw.write("Name: " + name + "\n");
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    /*public static void createUserFile() {
        try {
            File f = new File("src/person.data");
            Scanner s = new Scanner(f);
            int line = 1;
            String name = "";
            // reading from the file line by line
            while (s.hasNextLine()) {
                String data = s.nextLine();
                if (line == 1) {
                    name = data;
                }
                line++;
            }
            s.close();
            User u =  new User(name);
            welcomeMessage();
            MainCmds m = new MainCmds("src/txt.data");

        }
        // if the file doesn't exist, we will create a blank Person object and ask them for a name and hobby
        catch (FileNotFoundException e) {
            User u = new User();

            System.out.print("What is your name? ");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            System.out.print("What is your hobby? ");
            String hobby = in.nextLine();
            p.setName(name);
            p.setHobby(hobby);
            p.save();
        }
    }*/
}
