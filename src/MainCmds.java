import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class  MainCmds {
    private ArrayList<String> gifs;
    private ArrayList<String> pictures;
    private ArrayList<String> messages;
    private ArrayList<String> reminders;

    public MainCmds() {
        gifs = createLists("src/AnimalGifs.txt");
        pictures = createLists("src/AnimalPictures.txt");
        messages = createLists("src/Messages.txt");
        reminders = createLists("src/Reminders.txt");
    }

    public void getGifs() {
        String gif = gifs.remove((int) (Math.random() * gifs.size()));
        System.out.println("Gif Link: Click on it!\n" + gif);
        menu();
    }
    public void getPictures() {
        String picture = pictures.remove((int) (Math.random() * pictures.size()));
        System.out.println("Picture Link: Click on it!\n" + picture);
        menu();
    }
    public void getMessages() {
        String message = messages.remove((int) (Math.random() * messages.size()));
        System.out.println("Message: " + message);
        menu();
    }
    public void getReminders() {
        String reminder = reminders.remove((int) (Math.random() * reminders.size()));
        System.out.println("Daily Reminder: " + reminder);
        menu();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Messages");
        System.out.println("2. Daily Reminders");
        System.out.println("3. Animal Pictures");
        System.out.println("4. Animal Gifs");
        System.out.println("5. Exit");
        System.out.print("Pick one: ");
        int choice = s.nextInt();
        if (choice == 1) {
            getMessages();
        }
        if (choice == 2) {
            getReminders();
        }
        if (choice == 3) {
            getPictures();
        }
        if (choice == 4) {
            getGifs();
        }
    }


    public static ArrayList<String> createLists(String fileName) {
        ArrayList<String> tempList = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String data = s.nextLine();
                tempList.add(data);
                //System.out.println("testing");
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        return tempList; // can be used for the final part
    }

    // still working on this
    public static void updateFiles(String fileName, ArrayList<String> list) {
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
