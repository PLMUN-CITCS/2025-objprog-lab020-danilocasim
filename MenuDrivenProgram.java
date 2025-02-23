import java.util.Scanner;

public class MenuDrivenProgram {
    
    public static void main(String[] args) {
        int choice;

        while (true) {
            displayMenu();
            choice = getUserChoice("Enter your Choice (1-3): ");
            handleMenuChoice(choice);
            if (choice == 3) break;
            
           
        }
         

    }

    public static int getUserChoice(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int choice = scanner.nextInt();
        if (choice == 3) scanner.close();
        return choice;
    }

    public static void handleMenuChoice (int num) {
        if (num == 1) {
            greetUser();
        }
         else if (num == 2) {
            int checkNum = getUserChoice("Enter an Integer: ");
            System.out.println(checkEvenOrOdd((checkNum)));
         }
         else if (num == 3) {
            System.out.println("Exiting program. Goodbye!");
         } else {
            System.out.println("Invalid Choice.");
         }
       
    }

    public static void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }   

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    public static String checkEvenOrOdd (int num) {
        return (num % 2 == 0) ? num + " is an Even number." : num + " is an Odd number." ;
    }
}