package com.example.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookStore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
