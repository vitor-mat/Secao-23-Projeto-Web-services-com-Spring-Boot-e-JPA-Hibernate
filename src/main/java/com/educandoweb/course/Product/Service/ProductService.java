package com.educandoweb.course.Product.Service;

import com.educandoweb.course.Product.model.Product;
import com.educandoweb.course.Product.repository.ProductRepository;
import com.educandoweb.course.User.model.User;
import com.educandoweb.course.User.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }
}
