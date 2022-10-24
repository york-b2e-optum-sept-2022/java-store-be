package net.yorksolutions.storebackend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // localhost:8080/api
public class IndexController {
    ProductService productService;

    public IndexController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/getProducts")
    public Iterable<Product> getProducts(){
        return this.productService.getAll();
    }
    @PostMapping("/save")
    public void saveProduct(@RequestBody Product p){
        productService.save(p);
    }
}
