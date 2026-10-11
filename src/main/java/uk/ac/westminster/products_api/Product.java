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
    // Getters: Required for serialization.
    // Jackson looks for public 'get<FieldName>()' methods to read private field values for JSON responses.
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
