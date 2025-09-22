package com.arnex.store;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
