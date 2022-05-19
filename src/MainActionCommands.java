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

    public MainActionCommands() {
        gifs = createLists("src/AnimalGifs.txt");
        pictures = createLists("src/AnimalPictures.txt");
        messages = createLists("src/Messages.txt");
        reminders = createLists("src/Reminders.txt");
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

    public ArrayList<String> createLists(String fileName) {
        ArrayList<String> tempList = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                tempList.add(data);
                System.out.println("testing");
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        return tempList; // can be used for the final part
    }

    public void updateFiles(String fileName, ArrayList<String> list) {
        String temp = fileName.substring(0, 4) + "temp" + fileName.substring(4);
        ArrayList<String> tempList = createLists(fileName);
        try {
            for (int i = 0; i < list.size(); i++) {
                for (int y = 0; y < tempList.size(); y++) {
                    if (list.get(i).equals(tempList.get(y))) {
                        tempList.remove(y);
                        y--;
                    }
                }
            }

            File t = new File(temp);
            t.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter(temp);
            for (String i : tempList) {
                fw.write(i);
            }
            fw.close();

        }
        catch (IOException e) {
            //File t = new File(temp);
            //t.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            System.out.println("Unable to update files");
            e.printStackTrace();
        }
    }
}
