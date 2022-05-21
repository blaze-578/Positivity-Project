import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class User {
    private String name;
    private Color color;
    private int startingNumber;

    private ArrayList<String> gifs;
    private ArrayList<String> pictures;
    private ArrayList<String> messages;
    private ArrayList<String> reminders;

    public User(String n, Color c, int s) {
        // main constructor
        name = n;
        color = c;
        startingNumber = s;
        gifs = MainActionCommands.createLists("src/AnimalGifs.txt");
        pictures = MainActionCommands.createLists("src/AnimalPictures.txt");
        messages = MainActionCommands.createLists("src/Messages.txt");
        reminders = MainActionCommands.createLists("src/Reminders.txt");
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
