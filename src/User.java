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

    public void endLoop() {
        System.out.println("I hope this helped! Have a nice day!");
        System.exit(0);
    }
    public void errorLoop() {
        System.out.println("Sorry, I'm not sure what you typed. Try again!");
        menu();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Messages");
        System.out.println("2. Daily Reminders");
        System.out.println("3. Animal Pictures");
        System.out.println("4. Animal Gifs");
        System.out.println("5. Random");
        System.out.println("6. Exit");
        System.out.print("Pick one: ");
        int choice = s.nextInt();
        if (choice == 1) {
            m.getMessages();
        }
        if (choice == 2) {
            m.getReminders();
        }
        if (choice == 3) {
            m.getPictures();
        }
        if (choice == 4) {
            m.getGifs();
        }
        if (choice == 5) {
            int tempNum = 0;
            for (ArrayList<String> i : m.getAll()) {
                if (i.size() > 0) {
                    tempNum++;
                }
            }
            if (tempNum == 0) {
                m.empty();
            }
            else {
                boolean x = true;
                int num = 0;
                while (x) {
                    num = (int) (Math.random() * 4);
                    if (all.get(num).size() != 0) {
                        x = false;
                    }
                }
                num++;
                if (num == 1) {
                    m.getMessages();
                }
                if (num == 2) {
                    m.getReminders();
                }
                if (num == 3) {
                    m.getPictures();
                }
                if (num == 4) {
                    m.getGifs();
                }
            }
        }
        if (choice == 6) {
            endLoop();
        }
        else {
            m.errorLoop();
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
