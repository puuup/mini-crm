package com.mini.crm.event.repository;

import com.mini.crm.event.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
