import java.util.Scanner;


public class testingClass {
    public static void main(String[] args) throws InterruptedException {
        MainCmds m = new MainCmds("src/AllFiles.txt");

        String name = User.welcomeMessage();

        User n = new User(name);
        m.menu();
    }
}
