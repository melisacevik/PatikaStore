import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;
public class Phone extends Product {
    private static TreeSet<Phone> phones = new TreeSet<>(new OrderPhoneComparator());
    private static int nextPhoneID = 1;
    public int phoneID;

    public String internalMemory;
    public double batteryStatus;
    public int camera;
    public String color;

    public Phone(double unitPrice, int discountRate, int amountOfStock, String productName, String brandInfo, double screenSize, int RAM, String internalMemory, double batteryStatus, int camera, String color) {
        super(null, unitPrice, discountRate, amountOfStock, productName, brandInfo, screenSize, RAM);
        this.internalMemory = internalMemory;
        this.batteryStatus = batteryStatus;
        this.camera = camera;
        this.color = color;
        this.phoneID = nextPhoneID++;

    }

    public int getPhoneID() {
        return phoneID;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public int getCamera() {
        return camera;
    }

    public String getColor() {
        return color;
    }

    public static TreeSet<Phone> addPhone() {
        Scanner scan = new Scanner(System.in);
        TreeSet<Phone> tempPhones = new TreeSet<>(new OrderPhoneComparator());

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

        System.out.println("Enter Internal Memory (GB):");
        String internalMemory = scan.next();

        System.out.println("Enter Battery Status: ");
        double batteryStatus = 0;
        boolean validBattery = false;
        while (!validBattery) {
            try {
                batteryStatus = Double.parseDouble(scan.next());
                validBattery = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid battery status! Please enter a valid number for Battery Status:");
            }
        }

        System.out.println("Enter Camera :");
        int camera = 0;
        boolean validCamera = false;
        while (!validCamera) {
            try {
                camera = Integer.parseInt(scan.next());
                validCamera = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid camera value! Please enter a valid number for Camera:");
            }
        }

        System.out.println("Enter Phone Color: ");
        String color = scan.next();

        Phone newPhone = new Phone(unitPrice, discountRate, amountOfStock, productName, brandInfo, screenSize, RAM, internalMemory, batteryStatus, camera, color);
        phones.add(newPhone);
        System.out.println("New phone has been added successfully.");

        return tempPhones;
    }

    /*
    public static TreeSet<Phone> userAddPhone() {

        for (Phone phone : phones) {
            System.out.println("Phone ID: " + phone.getPhoneID());
            System.out.println("Product Name: " + phone.getProductName());
            System.out.println("Brand Info: " + phone.getBrandInfo());
            System.out.println("Internal Memory: " + phone.getInternalMemory() + " GB");
            System.out.println("Screen Size: " + phone.getScreenSize() + " inches");
            System.out.println("RAM: " + phone.getRAM() + " GB");
            System.out.println("Battery Status: " + phone.getBatteryStatus());
            System.out.println("Camera: " + phone.getCamera() + " MP");
            System.out.println("Color: " + phone.getColor());
            System.out.println("---------------------------------------------");
        }
        return tempPhones;
    }

     */

    public static TreeSet<Phone> List() {
        System.out.println("\t\t\t\t\t\t\tPhones List");

        TreeSet<Phone> phones = new TreeSet<>(new OrderPhoneComparator());

        phones.add(new Phone(7000.0, 0, 0, "Samsung Galaxy S21", "Samsung", 6.2, 8, "128 GB", 90.5, 12, "Black"));
        phones.add(new Phone(3699.0, 0, 0, "iPhone 12", "Apple", 6.1, 6, "256 GB", 95.0, 12, "White"));
        phones.add(new Phone(8199.0, 0, 0, "Sony Xperia 1 III", "Sony", 6.5, 12, "256 GB", 88.0, 12, "Green"));

        return phones;
    }

    @Override
    public String toString() {
        String format = "| %-2d | %-29s | %-9.1f TL | %-9s | %-9d | %-9.1f | %-9d |%n";
        String separator = "----------------------------------------------------------------------------------------------------";
        return String.format(format, phoneID, productName, unitPrice, brandInfo, internalMemory, screenSize, RAM) + separator;
    }

    public static void printPhoneTable(TreeSet<Phone> phones) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM          |");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Phone phone : phones) {
            System.out.printf("| %-2d | %-29s | %-9.1f TL | %-9s | %-9s | %-9.1f | %-9d |%n",
                    phone.getPhoneID(), phone.getProductName(), phone.getUnitPrice(),
                    phone.getBrandInfo(), phone.getInternalMemory(), phone.getScreenSize(), phone.getRAM());
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }


    /*
    public static void removePhone() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the unique code of the phone to remove:");
        String uniqueCode = scan.next();

        boolean isRemoved = false;
        for (Phone phone : phones) {
            if (phone.getUniqueCode().equals(uniqueCode)) {
                phones.remove(phone);
                isRemoved = true;
                break;
            }
        }

        if (isRemoved) {
            System.out.println("Phone with unique code " + uniqueCode + " has been removed successfully.");
        } else {
            System.out.println("Phone with unique code " + uniqueCode + " was not found.");
        }
    }

     */

}

