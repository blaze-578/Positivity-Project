import java.util.Scanner;


public class testingClass {
    public static void main(String[] args) throws InterruptedException {
        MainCmds m = new MainCmds("AllFiles.txt");

        //ArrayList<String> temp = m.getGifs();
        /*for (String i : temp) {
            System.out.println(i);
        }*/
        //m.updateFiles("src/AnimalGifs.txt", m.getGifs());

        //System.out.println(m.getMessages());

        String name = User.welcomeMessage();

        User n = new User(name);
        m.menu();
    }
}
