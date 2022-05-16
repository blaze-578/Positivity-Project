import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActionCommands {
    private String name;
    private Color color;
    private int startingNumber;
    private int menu;

    MainActionCommands(String n, Color c, int s) {
        // main constructor
        name = n;
        color = c;
        startingNumber = s;

    }

    public void saveUserInfo() {
        try {
            File f = new File("src/user.data");
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter("src/user.data");
            fw.write(name + "\n" + color + "\n" + startingNumber);
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }

    public void saveInfo(ArrayList<String> list, String fileName) {
        try {
            File f = new File(fileName);
            f.createNewFile(); // this method will create the file if it does not exist, if it does exist, it does nothing
            FileWriter fw = new FileWriter(fileName);
            for (int i = 0; i < list.size() - 1; i++) {
                fw.write(list.get(i) + "\n");
            }
            fw.write(list.get(list.size() - 1));
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }


}
