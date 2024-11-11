import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean redo = false;
        boolean redo2 = false;
        double sum = 0;

        do {
            double price = InputHelper.getRangedDouble(scan, "Please input the price of your object:", 0.50, 9.99);
            sum += price;
            do {
                String userInput = InputHelper.getNonZeroLenString(scan, "Do you want to add another item [Y/N]?");
                if (userInput.equalsIgnoreCase("n")) {
                    redo = true;
                    redo2 = true;
                } else if (userInput.equalsIgnoreCase("y")) {
                    redo2 = true;
                } else {
                    System.out.println("Please input a valid answer:");
                }
            } while(!redo2);

        } while(!redo);
        System.out.printf("%s $%4.2f", "The total price of your purchase is: ", sum);



    }
}