package uk.ac.westminster.products_api;

// Tut04-Activity02
public class PhysicalProduct extends Product {

    private double weightKG;
    private String dimensions;

    public PhysicalProduct (Long id, String name, double price, double weightKG, String dimensions){
        super(id, name,price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    // Weight in KG
    public double getWeightKG(){
        return weightKG;
    }
    public void setWeightKG(double weightKG){
        this.weightKG = weightKG;
    }

    // Dimensions
    public String getDimensions(){
        return dimensions;
    }
    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }
}
