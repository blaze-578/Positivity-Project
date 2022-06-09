import java.util.ArrayList;

public class list {
    private ArrayList<String> list;

    public list() {
        list = new ArrayList<String>()
    }

    public void getString(String s) throws InterruptedException {
        if (list.size() > 0) {
            String reminder = list.remove((int) (Math.random() * list.size()));
            System.out.println("\n" + Color.YELLOW_BRIGHT + "Daily Reminder: " + Color.WHITE_BRIGHT + reminder + "\n");
            Thread.sleep(2000);
        }
        else if (list.size() == 0) {
            Thread.sleep(2000);
            System.out.println("There are no more " + s + " left :(");
            Thread.sleep(2000);
        }
    }

    public void setList(ArrayList<String> s) {
        list = s;
    }
    public void addMessage(String s) {
        list.add(s);
    }

}
