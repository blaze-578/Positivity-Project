import java.util.ArrayList;

public class User {
    private String name;

    public User(String n) throws InterruptedException {
        // main constructor
        name = n;
        welcomeMessage();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return("Name: " + getName());
    }

    public void welcomeMessage() throws InterruptedException {
        System.out.println("\nWelcome " + name + ", I hope your day is going well.");
        Thread.sleep(2000);
        System.out.println("If not, I hope this project helps!\n");
        Thread.sleep(3500);
    }


}
