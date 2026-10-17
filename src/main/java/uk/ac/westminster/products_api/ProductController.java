package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

// @RestController marks this class as a web controller handling HTTP requests
// @RequestMapping("/products") sets the base URL path for all endpoints in this class
@RestController
@RequestMapping("/products")
public class ProductController {

    // Spring automatically creates the ProductService and hands it over here
    @Autowired
    private ProductService productService;

    // GET /products - Returns the full list of products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET /products/{id} - Fetches a single product by its ID from the URL path
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    // POST /products - Creates a new product from incoming JSON request body
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    // DELETE /products/{id} - Removes a product by its ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    // GET /products/search?name=... - Searches for products matching a partial name
    @GetMapping("/search")
    public List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}