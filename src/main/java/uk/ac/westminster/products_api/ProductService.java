package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// @Service tells Spring Boot to create and manage this class
@Service
public class ProductService {


    private final List<Product> products = new ArrayList<>();
    private long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(1L, "E-Book", 19.99, "/downloads/clean-code.pdf", 4.2));
        products.add(new PhysicalProduct(2L, "Desk Lamp", 45.00, 1.2, "14cm * 12cm * 34cm"));
    }

    // Retrieves the entire list of products
    public List<Product> getAllProducts() {
        return products;
    }

    // Assigns an ID, adds the new product to our list, and returns it
    public Product addProduct(Product product) {
        product.setId(nextId++); // Assigns the current ID, then increments it for the next product
        products.add(product);
        return product;
    }

    // Finds a single product by its ID using Java Streams (returns Optional in case it doesn't exist)
    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id)) // Matches the ID safely using .equals()
                .findFirst();
    }

    // Deletes a product by its ID safely using removeIf
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    // Searches for products whose names contain the given search text
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}