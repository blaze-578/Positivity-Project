import java.util.Scanner;


public class testingClass {
    public static void main(String[] args) {
        MainCmds m = new MainCmds();

        //ArrayList<String> temp = m.getGifs();

        /*for (String i : temp) {
            System.out.println(i);
        }*/
        //m.updateFiles("src/AnimalGifs.txt", m.getGifs());

        Scanner s = new Scanner(System.in);

        System.out.println(m.getGifs());

        System.out.print("Hello, welcome to the Positivity Machine, what is your name? ");
        String name = s.nextLine();
        System.out.println(name);
        Color.colorMenu();



    }
}
