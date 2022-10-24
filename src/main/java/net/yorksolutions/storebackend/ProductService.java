package net.yorksolutions.storebackend;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {
    ProductRepo productRepo;

    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }
    public Iterable<Product> getAll(){
        return this.productRepo.findAll();
    }
    public void save(Product p) {
       //do work
        p.productName = p.productName.toLowerCase().replace(" ", "");
        if(p.price < 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
       this.productRepo.save(p);
    }
}
