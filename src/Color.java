import java.util.ArrayList;
import java.util.Arrays;
public class Color {
    // reset
    public static final String RESET = "\u001B[0m"; // default

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static final String PEACH = "\033[1;91m";

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m"; // BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";   // RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m"; // GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";  // BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m";// PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE

    public static void colorMenu() {
        System.out.println("Color Menu:");
        System.out.println("1. " + BLACK + "Black" + RESET);
        System.out.println("2. " + RED + "Red" + RESET);
        System.out.println("3. " + GREEN + "Green" + RESET);
        System.out.println("4. " + YELLOW + "Yellow" + RESET);
        System.out.println("5. " + BLUE + "Blue" + RESET);
        System.out.println("6. " + PURPLE + "Purple" + RESET);
        System.out.println("7. " + CYAN + "Cyan" + RESET);
        System.out.println("8. " + WHITE + "White" + RESET);
    }

    public static final ArrayList<String> BLACKARRAYLIST = new ArrayList<String>(Arrays.asList(BLACK, BLACK_BOLD, BLACK_UNDERLINED, BLACK_BACKGROUND, BLACK_BRIGHT, BLACK_BOLD_BRIGHT, BLACK_BACKGROUND_BRIGHT));
    public static final ArrayList<String> REDARRAYLIST = new ArrayList<String>(Arrays.asList(RED, RED_BOLD, RED_UNDERLINED, RED_BACKGROUND, RED_BRIGHT, RED_BOLD_BRIGHT, RED_BACKGROUND_BRIGHT));
    public static final ArrayList<String> GREENARRAYLIST = new ArrayList<String>(Arrays.asList(GREEN, GREEN_BOLD, GREEN_UNDERLINED, GREEN_BACKGROUND, GREEN_BRIGHT, GREEN_BOLD_BRIGHT, GREEN_BACKGROUND_BRIGHT));
    public static final ArrayList<String> YELLOWARRAYLIST = new ArrayList<String>(Arrays.asList(YELLOW, YELLOW_BOLD, YELLOW_UNDERLINED, YELLOW_BACKGROUND, YELLOW_BRIGHT, YELLOW_BOLD_BRIGHT, YELLOW_BACKGROUND_BRIGHT));
    public static final ArrayList<String> BLUEARRAYLIST = new ArrayList<String>(Arrays.asList(BLUE, BLUE_BOLD, BLUE_UNDERLINED, BLUE_BACKGROUND, BLUE_BRIGHT, BLUE_BOLD_BRIGHT, BLUE_BACKGROUND_BRIGHT));
    public static final ArrayList<String> PURPLEARRAYLIST = new ArrayList<String>(Arrays.asList(PURPLE, PURPLE_BOLD, PURPLE_UNDERLINED, PURPLE_BACKGROUND, PURPLE_BRIGHT, PURPLE_BOLD_BRIGHT, PURPLE_BACKGROUND_BRIGHT));
    public static final ArrayList<String> CYANARRAYLIST = new ArrayList<String>(Arrays.asList(CYAN, CYAN_BOLD, CYAN_UNDERLINED, CYAN_BACKGROUND, CYAN_BRIGHT, CYAN_BOLD_BRIGHT, CYAN_BACKGROUND_BRIGHT));
    public static final ArrayList<String> WHITEARRAYLIST = new ArrayList<String>(Arrays.asList(WHITE, WHITE_BOLD, WHITE_UNDERLINED, WHITE_BACKGROUND, WHITE_BRIGHT, WHITE_BOLD_BRIGHT, WHITE_BACKGROUND_BRIGHT));
}