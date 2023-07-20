import java.util.TreeSet;
import java.util.UUID;
import java.util.Scanner;

public class Notebook extends Product {
    private static TreeSet<Notebook> notebooks = new TreeSet<>(new OrderNotebookComparator());

    private static int nextNotebookID = 1;
    public int storage;
    public int notebookID;

    public Notebook(String uniqueCode, double unitPrice, int discountRate, int amountOfStock, String productName, String brandInfo, double screenSize, int RAM, int storage) {
        super(uniqueCode, unitPrice, discountRate, amountOfStock, productName, brandInfo, screenSize, RAM);
        this.storage = storage;
        this.notebookID = nextNotebookID++;
    }

    public int getNotebookID() {
        return notebookID;
    }

    public int getStorage() {
        return storage;
    }

    public static void addNotebook() {
        Scanner scan = new Scanner(System.in);

        String uniqueCode = UUID.randomUUID().toString();

        System.out.println("Enter Brand Info:");
        String brandInfo = scan.next();

        System.out.println("Enter Product Name:");
        String productName = scan.next();

        System.out.println("Enter Unit Price:");
        double unitPrice = 0;
        boolean validPrice = false;
        while (!validPrice) {
            try {
                unitPrice = Double.parseDouble(scan.next());
                validPrice = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price! Please enter a valid number for Unit Price:");
            }
        }

        System.out.println("Enter Discount Rate:");
        int discountRate = 0;
        boolean validDiscount = false;
        while (!validDiscount) {
            try {
                discountRate = Integer.parseInt(scan.next());
                validDiscount = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid discount rate! Please enter a valid number for Discount Rate:");
            }
        }

        System.out.println("Enter Amount of Stock:");
        int amountOfStock = 0;
        boolean validStock = false;
        while (!validStock) {
            try {
                amountOfStock = Integer.parseInt(scan.next());
                validStock = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid stock amount! Please enter a valid number for Amount of Stock:");
            }
        }

        System.out.println("Enter Screen Size (inches):");
        double screenSize = 0;
        boolean validScreenSize = false;
        while (!validScreenSize) {
            try {
                screenSize = Double.parseDouble(scan.next());
                validScreenSize = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid screen size! Please enter a valid number for Screen Size:");
            }
        }

        System.out.println("Enter RAM (GB):");
        int RAM = 0;
        boolean validRAM = false;
        while (!validRAM) {
            try {
                RAM = Integer.parseInt(scan.next());
                validRAM = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid RAM amount! Please enter a valid number for RAM:");
            }
        }

        System.out.println("Enter Storage (GB):");
        int storage = 0;
        boolean validStorage = false;
        while (!validStorage) {
            try {
                storage = Integer.parseInt(scan.next());
                validStorage = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid storage amount! Please enter a valid number for Storage:");
            }
        }

        Notebook newNotebook = new Notebook(uniqueCode, unitPrice, discountRate, amountOfStock, productName, brandInfo, screenSize, RAM, storage);
        notebooks.add(newNotebook);
        System.out.println("New notebook has been added successfully.");
    }

    public static TreeSet<Notebook> userAddList() {
        for (Notebook notebook : notebooks) {
            System.out.println("Notebook ID: " + notebook.getNotebookID());
            System.out.println("Product Name: " + notebook.getProductName());
            System.out.println("Brand Info: " + notebook.getBrandInfo());
            System.out.println("Storage: " + notebook.getStorage() + " GB");
            System.out.println("Screen Size: " + notebook.getScreenSize() + " inches");
            System.out.println("RAM: " + notebook.getRAM() + " GB");
            System.out.println("---------------------------------------------");
        }
        return notebooks;
    }

    public static TreeSet<Notebook> List() {
        System.out.println("\t\t\t\t\t\t\tNotebooks List");
        TreeSet<Notebook> notebooks = new TreeSet<>(new OrderNotebookComparator());

        notebooks.add(new Notebook(UUID.randomUUID().toString(), 7000.0, 0, 0, "HUAWEI Matebook 14", "Huawei", 14.0, 16, 512));
        notebooks.add(new Notebook(UUID.randomUUID().toString(), 3699.0, 0, 0, "LENOVO V14 IGL", "Lenovo", 14.0, 8, 1024));
        notebooks.add(new Notebook(UUID.randomUUID().toString(), 8199.0, 0, 0, "ASUS Tuf Gaming", "Asus", 15.6, 32, 2048));

        return notebooks;
    }

    @Override
    public String toString() {
        String format = "| %-2d | %-29s | %-9.1f TL | %-9s | %-9d | %-9.1f | %-9d |%n";
        String separator = "----------------------------------------------------------------------------------------------------";
        return String.format(format, notebookID, productName, unitPrice, brandInfo, storage, screenSize, RAM) + separator;
    }

    public static void printNotebookTable(TreeSet<Notebook> notebooks) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Notebook notebook : notebooks) {
            System.out.printf("| %-2d | %-29s | %-9.1f TL | %-9s | %-9d | %-9.1f | %-9d |%n",
                    notebook.getNotebookID(), notebook.getProductName(), notebook.getUnitPrice(),
                    notebook.getBrandInfo(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRAM());
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}
