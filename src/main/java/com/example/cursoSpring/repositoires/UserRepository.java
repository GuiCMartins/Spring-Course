package com.example.cursoSpring.repositoires;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
