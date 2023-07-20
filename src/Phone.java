import java.util.TreeSet;

public class Phone extends Product {

    public int phoneID;
    public String internalMemory; // dahili hafıza
    public double batteryStatus; // pil durumu
    public int camera;
    public String color;

    public Phone(int phoneID, String brandInfo, String productName, double unitPrice, String internalMemory, double screenSize, int camera, double batteryStatus, int RAM, String color) {
        super(null, unitPrice, 0, 0, productName, brandInfo, screenSize, RAM);
        this.phoneID = phoneID;
        this.internalMemory = internalMemory;
        this.batteryStatus = batteryStatus;
        this.camera = camera;
        this.color = color;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public double getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(double batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static TreeSet<Phone> phoneList() {
        TreeSet<Phone> phones = new TreeSet<>(new OrderPhoneComparator());
        phones.add(new Phone(1, "Samsung", "GALAXY A51", 1000, "64GB", 6.5, 32, 4000.0, 3, "Pink"));
        phones.add(new Phone(2, "Apple", "Iphone 11", 3000, "128GB", 8.5, 55, 6000.0, 3, "Yellow"));
        return phones;
    }

    public void print() {
        String format = "| %-2d | %-29s | %-9.1f TL | %-9s | %-9s | %-9.1f | %-9d | %-9.1f | %-9d | %-9s |%n";
        String separator = "--------------------------------------------------------------------------------------------------------------------------------------";
        System.out.printf(format, phoneID, productName, unitPrice, brandInfo, internalMemory, screenSize, camera, batteryStatus, RAM, color);
        System.out.println(separator);
    }
}
