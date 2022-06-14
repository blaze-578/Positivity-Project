import java.util.ArrayList;
import java.util.Scanner;

public class List {
    private ArrayList<String> list;
    private ArrayList<String> permList;
    private final String option;
    private final String color;

    public List(String s, String c) {
        list = new ArrayList<String>();
        permList = new ArrayList<String>();
        option = s;
        color = c;
    }

    public void getString() throws InterruptedException {
        if (list.size() > 0) {
            String reminder = list.remove((int) (Math.random() * list.size()));
            System.out.println("\n" + color + option + Color.WHITE_BRIGHT + ": " + reminder + "\n");
            Thread.sleep(2000);
        }
        else if (list.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more " + option + " left :(");
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
        }
    }

    public void addString(String s) {
        list.add(s);
    }
    public void setPermList(String s) {
        permList.add(s);
    }
    public void reset() {
        list = permList;
    }
    public ArrayList<String> getList() {
        return list;
    }
    public void stats(int num) {
        System.out.println(Color.WHITE_BRIGHT + num + ". " + color + option + " (" + list.size() + "/" + permList.size() + ")");
    }
}
