import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;

    public User(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}
