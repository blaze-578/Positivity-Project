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

    private ArrayList<String> currentGifs;
    private ArrayList<String> currentPictures;
    private ArrayList<String> currentMessages;
    private ArrayList<String> currentReminders;

    public MainActionCommands() {
        gifs = new ArrayList<String>();
        pictures = new ArrayList<String>();
        messages = new ArrayList<String>();
        reminders = new ArrayList<String>();
        currentGifs = new ArrayList<String>();
        currentPictures = new ArrayList<String>();
        currentMessages = new ArrayList<String>();
        currentReminders = new ArrayList<String>();

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

    public ArrayList<String> getCurrentGifs() {
        return currentGifs;
    }
    public ArrayList<String> getCurrentPictures() {
        return currentPictures;
    }
    public ArrayList<String> getCurrentMessages() {
        return currentMessages;
    }
    public ArrayList<String> getCurrentReminders() {
        return currentReminders;
    }

    // i need to figure out my sh-t for this one ;w;
    public void createLists(ArrayList<String> list, String fileName) {
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
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

    public void updateFiles(String fileName, ArrayList<String> list) {
        String temp = fileName.substring(0, 4) + "temp" + fileName.substring(4);
        try {
            createLists(list, temp);
            ArrayList<String> tempString = new ArrayList<String>();

            for (int i )


        }
        catch (IOException e) {
            //File t = new File(temp);
            //t.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            System.out.println("Unable to update files");
            e.printStackTrace();
        }
    }


}
