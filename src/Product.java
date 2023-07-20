import java.util.UUID;

public class Product {
    public String uniqueCode;
    public double unitPrice;
    public int discountRate; //indirim orani
    public int amountOfStock; //stok miktarı
    public String productName;
    public String brandInfo;  //marka bilgisi
    public double screenSize; //ekran boyutu
    public int RAM;

    public Product(String uniqueCode, double unitPrice, int discountRate, int amountOfStock, String productName, String brandInfo, double screenSize, int RAM) {
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.brandInfo = brandInfo;
        this.screenSize = screenSize;
        this.RAM = RAM;
        this.uniqueCode = generateUniqueCode();

    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    private String generateUniqueCode() {
        return UUID.randomUUID().toString();
    }
}
