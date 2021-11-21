package com.example.cursoSpring.repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
