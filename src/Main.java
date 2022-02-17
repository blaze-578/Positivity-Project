import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // creating ArrayLists for the files
        ArrayList<String> gifs = new ArrayList<String>();
        ArrayList<String> pictures = new ArrayList<String>();
        ArrayList<String> messages = new ArrayList<String>();
        ArrayList<String> reminders = new ArrayList<String>();

        /** more variables:
         * Name
         * Color choice
         * Starting choice
         */
        String name;


        // putting all the files into an ArrayList
        // gifs
        try {
            File f = new File ("Animal Gifs");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            while ((s = br.readLine()) != null) {
                gifs.add(s);
                System.out.print(".");
            }
        }
        catch (Exception e) {System.out.println("Help")}

        // pictures
        try {
            File f = new File ("Animal Pictures");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            while ((s = br.readLine()) != null) {
                pictures.add(s);
            }
        }
        catch (Exception e) { }

        // messages
        try {
            File f = new File ("Messages");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            while ((s = br.readLine()) != null) {
                messages.add(s);
            }
        }
        catch (Exception e) { }

        // reminders
        try {
            File f = new File ("Reminders");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            while ((s = br.readLine()) != null) {
                reminders.add(s);
            }
        }
        catch (Exception e) { }

        System.out.println(Color.BLACK + gifs);

        System.out.println("Welcome to the Positivity Project!");

    }

    public static void clearScreen()
    {   //clearing
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public String menu() {
        return (
                "Menu:\n" +
                        "1 - Positive message\n" +
                        "2 - Daily reminder\n" +
                        "3 - Cute Animal picture\n" +
                        "4 - Cute Animal Gif\n" +
                        "5 - Exit"
        );
    }
}
