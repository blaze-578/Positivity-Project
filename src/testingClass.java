import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;


public class testingClass {
    public static void main(String[] args) {
        MainActionCommands m = new MainActionCommands();

        ArrayList<String> temp = m.getGifs();

        /*for (String i : temp) {
            System.out.println(i);
        }*/
        //m.updateFiles("src/AnimalGifs.txt", m.getGifs());

        Scanner s = new Scanner(System.in);

        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print(name);


    }
}
