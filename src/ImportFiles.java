import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportFiles {
    // turns files into a list
    public static void importFiles(ArrayList<String> list, String fileName) {
        try {
            list = new ArrayList<String>();
            File f = new File (fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s = br.readLine();
            while ((s = br.readLine()) != null) {
                list.add(s);
            }
            br.close();
        }
        catch (IOException exception) {System.out.println("Help");}
    }
}
