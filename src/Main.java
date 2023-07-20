import java.util.TreeSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // TreeSet<Brand> brands = Brand.brandList();
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to PatikaStore Product Management Panel!");
            System.out.print("1 - Notebook Operations\n" +
                    "2 - Mobile Phone Operations\n" +
                    "3 - List Brands\n" +
                    "0 - Exit\n" +
                    "Your Choice: ");
            int userSelect = scan.nextInt();

            switch (userSelect) {
                case 1:
                    System.out.print("1 - Add Notebook\n" +
                            "2 - List Notebooks\n" +
                            "3 - Go Back\n" +
                            "Your Choice: ");
                    int notebookOperation = scan.nextInt();
                    switch (notebookOperation) {
                        case 1:
                            Notebook.addNotebook();
                            break;
                        case 2:
                            TreeSet<Notebook> notebooks = Notebook.List();
                            Notebook.printNotebookTable(notebooks);
                            break;
                        case 3:
                            System.out.println("Going back to the main menu.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("1 - Add Phone\n" +
                            "2 - List Phones\n" +
                            "3 - Go Back\n" +
                            "Your Choice: ");
                    int phoneOperation = scan.nextInt();
                    switch (phoneOperation) {
                        case 1:
                           // Notebook.addNotebook();
                            break;
                        case 2:
                            //TreeSet<Notebook> notebooks = Notebook.List();
                            // Notebook.printNotebookTable(notebooks);
                            break;
                        case 3:
                            System.out.println("Going back to the main menu.");
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Brand List:");
                    TreeSet<Brand> brands = Brand.brandList();
                    for (Brand brand : brands) {
                        System.out.println("Brand ID: " + brand.getBrandID() + ", Brand Name: " + brand.getBrandName());
                    }
                    break;
                case 0:
                    System.out.println("Exiting the Product Management Panel. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
