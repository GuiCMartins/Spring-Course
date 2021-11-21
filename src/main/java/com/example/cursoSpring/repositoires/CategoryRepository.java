package com.example.cursoSpring.repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
