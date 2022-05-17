import java.util.ArrayList;

public class testingClass {
    public static void main(String[] args) {
        MainActionCommands m = new MainActionCommands();

        ArrayList<String> temp = m.getGifs();

        for (String i : temp) {
            System.out.println(i);
        }
    }
}
