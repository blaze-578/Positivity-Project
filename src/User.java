import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private Color color;
    private int startingNumber;
    private MainCmds m;

    private ArrayList<String> gifs;
    private ArrayList<String> pictures;
    private ArrayList<String> messages;
    private ArrayList<String> reminders;

    public User(String n, Color c, int s) {
        // main constructor
        name = n;
        color = c;
        startingNumber = s;
        m = new MainCmds();
    }

    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }

    public String toString() {
        return("Name: " + getName());
    }


    /*public void saveUserInfo() {
        try {
            File f = new File("src/user.data");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/user.data");
            fw.write(name + "\n" + color + "\n" + startingNumber);
            fw.close();
        }
        catch (IOException e) {
            File f = new File("src/user.data");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/user.data");
            fw.write(name + "\n" + color + "\n" + startingNumber);
            fw.close();
        }
    }*/
}
