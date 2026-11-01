package uk.ac.westminster.products_api;

// Tut04-Activity02
public class PhysicalProduct extends Product implements Discountable{

    private double weightKG;
    private String dimensions;
    private double discountedPrice;


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

    @Override
    public String getSummary() {
        return "Weight:- " + getWeightKG() + "kg.";
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
