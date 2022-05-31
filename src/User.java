import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;

    public User() {
        name = "";
    }

    public User(String n) {
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

    public static void createFile() {
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
            System.out.println("Welcome back" + name);
            System.out.println("I hope your day is going well. If not, I hope this helps!\n");
            MainCmds m = new MainCmds("")

        }
        // if the file doesn't exist, we will create a blank Person object and ask them for a name and hobby
        catch (FileNotFoundException e) {
            Person p = new Person();
            System.out.println(p.greet());
            System.out.print("What is your name? ");
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            System.out.print("What is your hobby? ");
            String hobby = in.nextLine();
            p.setName(name);
            p.setHobby(hobby);
            p.save();
        }
    }
}
