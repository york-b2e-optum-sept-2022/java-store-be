package net.yorksolutions.storebackend;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    Iterable<Product> findByDisplayName(String display);
}
