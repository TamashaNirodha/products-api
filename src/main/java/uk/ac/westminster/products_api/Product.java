package uk.ac.westminster.products_api;

public class Product {
    /*
    public Long id;
    public String name;
    public double price;
    */

    private Long id;
    private String name;
    private double price;

    // No-arg constructor: Required by Jackson (Spring's JSON converter)
    // to instantiate an empty object first when receiving incoming HTTP request bodies (e.g., POST).
    public Product() {}

    // Parameterized constructor: Allows easy object initialization in controller methods
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // ID
    public Long getId() {

        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Name
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Price
    public double getPrice() {

        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
