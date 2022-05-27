import java.util.Scanner;


public class testingClass {
    public static void main(String[] args) throws InterruptedException {
        MainCmds m = new MainCmds();

        //ArrayList<String> temp = m.getGifs();

        /*for (String i : temp) {
            System.out.println(i);
        }*/
        //m.updateFiles("src/AnimalGifs.txt", m.getGifs());

        Scanner s = new Scanner(System.in);

        //System.out.println(m.getMessages());

        System.out.print(Color.WHITE_BRIGHT + "Hello, welcome to the " + Color.BLUE_BRIGHT + "Positivity Machine" + Color.WHITE_BRIGHT + ", what is your name? ");
        String name = s.nextLine();


        User n = new User(name);
        //Color.colorMenu();
        m.menu();



    }
}
