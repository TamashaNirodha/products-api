package uk.ac.westminster.products_api;

// Tut04-Activity 1
public class DigitalProduct extends Product{

    private String downloadURl;
    private double fileSizeMB;

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

}
