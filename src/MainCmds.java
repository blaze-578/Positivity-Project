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

    public String getGifs() {
        String gif = gifs.remove((int) (Math.random() * gifs.size()));
        return gif;
    }
    public String getPictures() {
        String picture = pictures.remove((int) (Math.random() * pictures.size()));
        return picture;
    }
    public String getMessages() {
        String message = messages.remove((int) (Math.random() * messages.size()));
        return message;
    }
    public String getReminders() {
        String reminder = reminders.remove((int) (Math.random() * reminders.size()));
        return reminder;
    }

    public static void colorMenu() {
        System.out.println("Color Menu:");
        System.out.println("1. " + Color.BLACK + "Black" + Color.RESET);
        System.out.println("2. " + Color.RED + "Red" + Color.RESET);
        System.out.println("3. " + Color.GREEN + "Green" + Color.RESET);
        System.out.println("4. " + Color.YELLOW + "Yellow" + Color.RESET);
        System.out.println("5. " + Color.BLUE + "Blue" + Color.RESET);
        System.out.println("6. " + Color.PURPLE + "Purple" + Color.RESET);
        System.out.println("7. " + Color.CYAN + "Cyan" + Color.RESET);
        System.out.println("8. " + Color.WHITE + "White" + Color.RESET);
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
