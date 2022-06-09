import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner; // Import the Scanner class to read text files

public class  MainCmds {
    /*private ArrayList<String> messages;
    private ArrayList<String> reminders;
    private ArrayList<String> pictures;
    private ArrayList<String> gifs;*/
    private list messages;
    private list reminders;
    private list pictures;
    private list gifs;
    private User u;
    private ArrayList<list> all;
    private int lastMenuNum;
    private String name;

    public MainCmds() {
        lastMenuNum = 0;
        messages = new list();
        reminders = new list();
        pictures = new list();
        gifs = new list();
    }

    public void getMessages() throws InterruptedException {
        if (messages.size() > 0) {
            String message = messages.remove((int) (Math.random() * messages.size()));
            System.out.println("\n" + Color.CYAN + "Message: " + Color.WHITE_BRIGHT + message + "\n");
            Thread.sleep(2000);
        }
        else if (messages.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more messages left :(");
            Thread.sleep(2000);
        }
        menu();
    }
    public void getReminders() throws InterruptedException {
        if (reminders.size() > 0) {
            String reminder = reminders.remove((int) (Math.random() * reminders.size()));
            System.out.println("\n" + Color.YELLOW_BRIGHT + "Daily Reminder: " + Color.WHITE_BRIGHT + reminder + "\n");
            Thread.sleep(2000);
        }
        else if (reminders.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more daily reminders left :(");
            Thread.sleep(2000);
        }
        menu();
    }
    public void getPictures() throws InterruptedException {
        if (pictures.size() > 0) {
            String picture = pictures.remove((int) (Math.random() * pictures.size()));
            System.out.println("\n" + Color.GREEN_BRIGHT + "Picture Link:" + Color.WHITE_BRIGHT + " Click on it!\n" + picture + "\n");
            Thread.sleep(2000);
        }
        else if (pictures.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more animal pictures left :(");
            Thread.sleep(2000);
        }
        menu();
    }
    public void getGifs() throws InterruptedException {
        if (gifs.size() > 0) {
            String gif = gifs.remove((int) (Math.random() * gifs.size()));
            Thread.sleep(2000);
            System.out.println("\n" + Color.BLUE + "Gif Link:" + Color.WHITE_BRIGHT + " Click on it!\n" + gif + "\n");
        }
        else if (gifs.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more gif links left :(");
            Thread.sleep(2000);
        }
        menu();
    }

    public void endLoop() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("\nI hope this helped! Have a nice day!");
        Thread.sleep(2000);
        saveTxtFiles();
    }
    public void errorLoop() throws InterruptedException {
        System.out.println("Sorry, I'm not sure what you typed. Try again!");
        Thread.sleep(2000);
        menu();
    }
    public void empty() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("No more messages/links :(");
        Scanner sc = new Scanner(System.in);
        Thread.sleep(2000);
        System.out.print("Would you like to reset everything? (y/n) ");
        String answer = sc.nextLine();
        if (answer.toLowerCase().equals("y")) {
            reset();
            Thread.sleep(5000);
            System.out.println("All options have been reset!");
            Thread.sleep(2000);
        }
        else {
            System.out.println("No options have been updated.");
            Thread.sleep(2000);
        }
        menu();
    }
    public void reset() {
        createLists("src/AllFiles.txt");
    }


    public void welcomeMessage() throws InterruptedException {
        try {
            File f = new File("src/PersonData.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                name = s.nextLine();
            }
            createLists("src/RemainingMessages.txt");

            System.out.println(Color.WHITE_BRIGHT + "Welcome back to the " + Color.BLUE_BRIGHT + "Positivity Machine " + Color.WHITE_BRIGHT + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this helps!\n");
            Thread.sleep(3500);
        }
        catch (IOException e) {
             createLists("src/AllFiles.txt");
            Scanner s = new Scanner(System.in);
            System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
            name = s.nextLine();

            System.out.println("\nWelcome " + name + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this project helps!\n");
            Thread.sleep(3500);
        }
        u = new User(name);
        menu();
    }

    public void menu() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println(Color.WHITE_BRIGHT + "Menu: ");
        Thread.sleep(500);
        System.out.println(Color.WHITE_BRIGHT + "1. " + Color.CYAN + "Messages");
        System.out.println(Color.WHITE_BRIGHT + "2. " + Color.YELLOW_BRIGHT + "Daily Reminders");
        System.out.println(Color.WHITE_BRIGHT + "3. " + Color.GREEN_BRIGHT + "Animal Pictures");
        System.out.println(Color.WHITE_BRIGHT + "4. " + Color.BLUE + "Animal Gifs");
        System.out.println(Color.WHITE_BRIGHT + "5. " + Color.PURPLE + "Random");
        System.out.println(Color.WHITE_BRIGHT + "6. " + Color.RED + "Exit");
        Thread.sleep(2000);
        System.out.print(Color.WHITE_BRIGHT + "Pick one: ");
        int choice = s.nextInt();
        Thread.sleep(200);
        if (choice == 1) {
            messages.getString("messages");
        }
        if (choice == 2) {
            reminders.getString("daily reminders");
        }
        if (choice == 3) {
            pictures.getString("animal pictures");
        }
        if (choice == 4) {
            getGifs();
        }
        if (choice == 5) {
            int tempNum = 0;
            for (ArrayList<String> i : all) {
                if (i.size() > 0) {
                    tempNum++;
                }
            }
            if (tempNum == 0) {
                empty();
            }
            else {
                boolean x = true;
                int num = 0;
                while (x) {
                    num = (int) (Math.random() * 4);
                    if (all.get(num).size() != 0) {
                        if (tempNum == 1) {
                            x = false;
                        }
                        if (num != lastMenuNum) {
                            lastMenuNum = num;
                            x = false;
                        }
                    }
                }
                num++;
                if (num == 1) {
                    getMessages();
                }
                if (num == 2) {
                    getReminders();
                }
                if (num == 3) {
                    getPictures();
                }
                if (num == 4) {
                    getGifs();
                }
            }
        }
        if (choice == 6) {
            endLoop();
        }
        else {
            errorLoop();
        }
    }

    public void createLists(String fileName) {
        messages = new ArrayList<String>();
        reminders = new ArrayList<String>();
        pictures = new ArrayList<String>();
        gifs = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            boolean message = true;
            boolean reminder = false;
            boolean picture = false;
            boolean gif = false;
            while (s.hasNextLine()) {
                String data = s.nextLine();
                if (data.substring(0,2).equals("~~")) {
                    if (data.equals("~~Reminders~~")) {
                        message = false;
                        reminder = true;
                    }
                    else if (data.equals("~~Pictures~~")) {
                        reminder = false;
                        picture = true;
                    }
                    else if (data.equals("~~Gifs~~")) {
                        picture = false;
                        gif = true;
                    }
                }
                if (data.substring(0,2).equals("~~") == false && message == true) {
                    messages.add(data);
                }
                if (data.substring(0,2).equals("~~") == false && reminder == true) {
                    reminders.add(data);
                }
                if (data.substring(0,2).equals("~~") == false && picture == true) {
                    pictures.add(data);
                }
                if (data.substring(0,2).equals("~~") == false && gif == true) {
                    gifs.add(data);
                }
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        all = new ArrayList<ArrayList<String>>(Arrays.asList(messages, reminders, pictures, gifs));
    }

    public void tempcreateLists(String fileName) {
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            boolean message = true;
            boolean reminder = false;
            boolean picture = false;
            boolean gif = false;
            while (s.hasNextLine()) {
                String data = s.nextLine();
                if (data.substring(0,2).equals("~~")) {
                    if (data.equals("~~Reminders~~")) {
                        message = false;
                        reminder = true;
                    }
                    else if (data.equals("~~Pictures~~")) {
                        reminder = false;
                        picture = true;
                    }
                    else if (data.equals("~~Gifs~~")) {
                        picture = false;
                        gif = true;
                    }
                }
                if (data.substring(0,2).equals("~~") == false && message == true) {
                    messages.addMessage(data);
                }
                if (data.substring(0,2).equals("~~") == false && reminder == true) {
                    reminders.addMessage(data);
                }
                if (data.substring(0,2).equals("~~") == false && picture == true) {
                    pictures.addMessage(data);
                }
                if (data.substring(0,2).equals("~~") == false && gif == true) {
                    gifs.addMessage(data);
                }
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        all = new ArrayList<list>(Arrays.asList(messages, reminders, pictures, gifs));
    }

    public void saveTxtFiles() {
        try {
            File f1 = new File("src/PersonData.txt");
            f1.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter personFileWriter = new FileWriter(f1);
            personFileWriter.write(name);
            personFileWriter.close();

            File f2 = new File("src/RemainingMessages.txt");
            f2.createNewFile();
            FileWriter fw = new FileWriter(f2);
            fw.write("~~Messages~~\n");
            for (int i = 0; i < messages.size(); i++) {
                fw.write(messages.get(i) + "\n");
            }
            fw.write("~~Reminders~~\n");
            for (int i = 0; i < reminders.size(); i++) {
                fw.write(reminders.get(i) + "\n");
            }
            fw.write("~~Pictures~~\n");
            for (int i = 0; i < pictures.size() - 1; i++) {
                fw.write(pictures.get(i) + "\n");
            }
            fw.write("~~Gifs~~\n");
            for (int i = 0; i < gifs.size() - 1; i++) {
                fw.write(gifs.get(i) + "\n");
            }
            fw.close();
            System.out.println("Files updated!");
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
        System.exit(0);
    }
}
