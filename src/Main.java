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
        ArrayList<String> gifs;
        ArrayList<String> pictures;
        ArrayList<String> messages;
        ArrayList<String> reminders;

        /** more variables:
         * Name
         * Color choice
         * Starting choice
         */
        String name;


        // putting all the files into an ArrayList
        // gifs
        try {
            File f = new File ("src/Animal Gifs");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            gifs = new ArrayList<String>();
            while ((s = br.readLine()) != null) {
                gifs.add(s);
            }
            br.close();
        }
        catch (IOException exception) {System.out.println("Help");}

        // pictures
        try {
            File f = new File ("src/Animal Pictures");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            pictures = new ArrayList<String>();
            while ((s = br.readLine()) != null) {
                pictures.add(s);
            }
            br.close();
        }
        catch (IOException exception) { }

        // messages
        try {
            File f = new File ("src/Messages");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            messages = new ArrayList<String>();
            while ((s = br.readLine()) != null) {
                messages.add(s);
            }
            br.close();
        }
        catch (IOException exception) { }

        // reminders
        try {
            File f = new File ("src/Reminders");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            reminders = new ArrayList<String>();
            while ((s = br.readLine()) != null) {
                reminders.add(s);
            }
            br.close();
        }
        catch (IOException exception) { }


        //System.out.println(Color.BLACK + gifs);

        System.out.println("Welcome to the Positivity Project!");

    }

    private void importFiles(String fileName, ArrayList<String> arrayListName) {
        try {
            File f = new File (fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            arrayListName = new ArrayList<String>();
            while ((s = br.readLine()) != null) {
                arrayListName.add(s);
                System.out.print(".");
            }
            br.close();
        }
        catch (IOException exception) {System.out.println("Help");}
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
