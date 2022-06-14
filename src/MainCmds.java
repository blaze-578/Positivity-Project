import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class  MainCmds {
    private List messages;
    private List reminders;
    private List pictures;
    private List gifs;
    private User u;
    private ArrayList<ArrayList<String>> all;
    private int lastMenuNum;

    public MainCmds() {
        lastMenuNum = 0;
        messages = new List("Messages", Color.CYAN);
        reminders = new List("Daily Reminders", Color.YELLOW_BRIGHT);
        pictures = new List("Animal Pictures", Color.GREEN_BRIGHT);
        gifs = new List("Animal Gifs", Color.BLUE);
        all = new ArrayList<ArrayList<String>>(Arrays.asList(messages.getList(), reminders.getList(), pictures.getList(), gifs.getList()));
        createPermLists();
    }

    public void endLoop() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("\nI hope this helped! Have a nice day!");
        Thread.sleep(2000);
        saveTxtFiles();
    }
    public void errorLoop() throws InterruptedException {
        System.out.println();
        System.out.println("Sorry, I'm not sure what you typed. Try again!");
        Thread.sleep(2000);
        System.out.println();
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
        messages.reset();
        reminders.reset();
        pictures.reset();
        gifs.reset();
    }
    public void stats() throws InterruptedException {
        System.out.println("\nCurrent stats:");
        messages.stats(1);
        reminders.stats(2);
        pictures.stats(3);
        gifs.stats(4);
        System.out.println();
        menu();
    }

    public void welcomeMessage() throws InterruptedException {
        try {
            String name;
            File f = new File("src/PersonData.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                name = s.nextLine();
                System.out.println(Color.WHITE_BRIGHT + "Welcome back to the " + Color.BLUE_BRIGHT + "Positivity Machine " + Color.WHITE_BRIGHT + name + ", I hope your day is going well.");
                u = new User(name);
            }
            createLists("src/RemainingMessages.txt");

            Thread.sleep(2000);
            System.out.println("If not, I hope this helps!\n");
            Thread.sleep(3500);
        }
        catch (IOException e) {
            String name;
            createLists("src/AllFiles.txt");
            Scanner s = new Scanner(System.in);
            System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
            name = s.nextLine();
            u = new User(name);

            System.out.println("\nWelcome " + u.getName() + ", I hope your day is going well.");
            Thread.sleep(2000);
            System.out.println("If not, I hope this project helps!\n");
            Thread.sleep(3500);
            u = new User(name);
        }
        menu();
    }

    public void menu() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println(Color.WHITE_BRIGHT + "Menu: ");
        Thread.sleep(500);
        System.out.println(Color.WHITE_BRIGHT + "[1] " + Color.CYAN + "Messages");
        System.out.println(Color.WHITE_BRIGHT + "[2] " + Color.YELLOW_BRIGHT + "Daily Reminders");
        System.out.println(Color.WHITE_BRIGHT + "[3] " + Color.GREEN_BRIGHT + "Animal Pictures");
        System.out.println(Color.WHITE_BRIGHT + "[4] " + Color.BLUE + "Animal Gifs");
        System.out.println(Color.WHITE_BRIGHT + "[5] " + Color.PURPLE + "Random");
        System.out.println(Color.WHITE_BRIGHT + "[6] " + Color.RED + "Exit");
        System.out.print(Color.WHITE_BRIGHT + "Pick one: ");
        String choice = s.nextLine();
        Thread.sleep(200);
        if (choice.equals("1")) {
            messages.getString();
            lastMenuNum = 1;
            menu();
        }
        else if (choice.equals("2")) {
            reminders.getString();
            lastMenuNum = 2;
            menu();
        }
        else if (choice.equals("3")) {
            pictures.getString();
            lastMenuNum = 3;
            menu();
        }
        else if (choice.equals("4")) {
            gifs.getString();
            lastMenuNum = 4;
            menu();
        }
        else if (choice.equals("5")) {
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
                    messages.getString();
                }
                if (num == 2) {
                    reminders.getString();
                }
                if (num == 3) {
                    pictures.getString();
                }
                if (num == 4) {
                    gifs.getString();
                }
            }
            menu();
        }
        else if (choice.equals("6")) {
            endLoop();
        }
        else if (choice.equals("stats")) {
            stats();
        }
        else if (choice.equals("reset")) {
            reset();
            menu();
        }
        else {
            errorLoop();
        }
    }

    public void createLists(String fileName) {
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
                    messages.addString(data);
                }
                if (data.substring(0,2).equals("~~") == false && reminder == true) {
                    reminders.addString(data);
                }
                if (data.substring(0,2).equals("~~") == false && picture == true) {
                    pictures.addString(data);
                }
                if (data.substring(0,2).equals("~~") == false && gif == true) {
                    gifs.addString(data);
                }
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
    public void createPermLists() {
        try {
            File f = new File("src/AllFiles.txt");
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
                    messages.setPermList(data);
                }
                if (data.substring(0,2).equals("~~") == false && reminder == true) {
                    reminders.setPermList(data);
                }
                if (data.substring(0,2).equals("~~") == false && picture == true) {
                    pictures.setPermList(data);
                }
                if (data.substring(0,2).equals("~~") == false && gif == true) {
                    gifs.setPermList(data);
                }
            }
            s.close();
        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    public void saveTxtFiles() {
        try {
            File f1 = new File("src/PersonData.txt");
            f1.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter personFileWriter = new FileWriter(f1);
            personFileWriter.write(u.getName());
            personFileWriter.close();

            File f2 = new File("src/RemainingMessages.txt");
            f2.createNewFile();
            FileWriter fw = new FileWriter(f2);
            fw.write("~~Messages~~\n");
            for (int i = 0; i < messages.getList().size(); i++) {
                fw.write(messages.getList().get(i) + "\n");
            }
            fw.write("~~Reminders~~\n");
            for (int i = 0; i < reminders.getList().size(); i++) {
                fw.write(reminders.getList().get(i) + "\n");
            }
            fw.write("~~Pictures~~\n");
            for (int i = 0; i < pictures.getList().size(); i++) {
                fw.write(pictures.getList().get(i) + "\n");
            }
            fw.write("~~Gifs~~\n");
            for (int i = 0; i < gifs.getList().size(); i++) {
                fw.write(gifs.getList().get(i) + "\n");
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
