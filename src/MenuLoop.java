
import java.util.Scanner;

public class MenuLoop {


    public void programStart() {

        System.out.println("Wprowadź Wartość");
        int i = 0;
        String userInput = null;
        do {
            Scanner input = new Scanner(System.in);

            Menu[] values = Menu.values();
            for (Menu value : values) {
                System.out.println(value);
            }

            try {
                userInput = input.nextLine();
                Menu menu = null;
                menu = Menu.valueOf(userInput);
                System.out.println(menu.wellcome);
                i = 1;


            } catch (IllegalArgumentException e) {
                System.err.println("NIEPOPRAWNE DANE");
                i = 0;
            }

        } while (i == 0);

    }

}
