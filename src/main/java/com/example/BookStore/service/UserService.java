package com.example.BookStore.service;

import com.example.BookStore.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
