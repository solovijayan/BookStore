package com.example.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookStore.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
