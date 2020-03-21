package com.sha.microserviceusermanagement.service;

import com.sha.microserviceusermanagement.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> ids);
}
