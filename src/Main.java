import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Menu menu = new Menu();
        LogReader logReader = new LogReader();
        ArrayList<Event> events = logReader.Parser();
        int choice = menu.showMenu();
        menu.runMethod(choice, events);
    }
}