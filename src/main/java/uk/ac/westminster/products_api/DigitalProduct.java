package uk.ac.westminster.products_api;

// Tut04-Activity 1
public class DigitalProduct extends Product implements Discountable{

    private String downloadURl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct (Long id, String name, double price, String downloadURl,double fileSizeMB) {
        super(id, name, price);
        this.downloadURl = downloadURl;
        this.fileSizeMB = fileSizeMB;

    }

    // Download URL
    public String getDownloadURL(){
        return downloadURl;
    }
    public void setDownloadURL(String downloadURL){
        this.downloadURl = downloadURL;
    }

    // File Size in MB
    public double getFileSizeMB(){
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadURl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
