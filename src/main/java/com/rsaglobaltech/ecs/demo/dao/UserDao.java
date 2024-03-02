package com.rsaglobaltech.ecs.demo.dao;

import com.rsaglobaltech.ecs.demo.entity.User;

public interface UserDao {
    public User findByUsername(String username);
    public void registerUser(String username, String password);
    public Boolean checkCredentialsMatch(String username, String password);
}
