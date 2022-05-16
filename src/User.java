import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    private String name;
    private Color color;
    private int startingNumber;
    private int menu;

    public User(String n, Color c, int s) {
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
}
