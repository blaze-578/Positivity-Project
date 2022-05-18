import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class MainActionCommands {
    private ArrayList<String> gifs;
    private ArrayList<String> pictures;
    private ArrayList<String> messages;
    private ArrayList<String> reminders;

    private ArrayList<String> usedGifs;
    private ArrayList<String> usedPictures;
    private ArrayList<String> usedMessages;
    private ArrayList<String> usedReminders;

    public MainActionCommands() {
        gifs = new ArrayList<String>();
        pictures = new ArrayList<String>();
        messages = new ArrayList<String>();
        reminders = new ArrayList<String>();
        usedGifs = new ArrayList<String>();
        usedPictures = new ArrayList<String>();
        usedMessages = new ArrayList<String>();
        usedReminders = new ArrayList<String>();

        createLists(gifs, "src/AnimalGifs.txt");
        createLists(pictures, "src/AnimalPictures.txt");
        createLists(messages, "src/Messages.txt");
        createLists(reminders, "src/Reminders.txt");
    }

    public ArrayList<String> getGifs() {
        return gifs;
    }
    public ArrayList<String> getPictures() {
        return pictures;
    }
    public ArrayList<String> getMessages() {
        return messages;
    }
    public ArrayList<String> getReminders() {
        return reminders;
    }

    // i need to figure out my sh-t for this one ;w;
    public static void createLists(ArrayList<String> list, String fileName) {
        try {
            File f = new File(fileName);
            String temp = fileName.substring(0, 4) + "temp" + fileName.substring(4);
            File t = new File(temp);
            Scanner s = new Scanner(f);
            t.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter(temp);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                list.add(data);
                System.out.println("testing");
            }
            s.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    public static void updateLists(String s, ArrayList<String> a) {

    }


}
