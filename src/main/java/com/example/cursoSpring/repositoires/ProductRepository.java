package com.example.cursoSpring.repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
